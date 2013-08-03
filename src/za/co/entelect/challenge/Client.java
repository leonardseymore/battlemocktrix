package za.co.entelect.challenge;

import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Client {

  public static final long RETRY_INTERVAL = 500;
  private ChallengeServiceStub client;
  private Board board;
  private String playerName;
  private Game game;
  private Timer timer;

  public Client(String targetEndpoint) throws AxisFault {
    client = new ChallengeServiceStub(targetEndpoint);
    timer = new Timer();
  }

  public void login() throws EndOfGameExceptionException, RemoteException, NoBlameExceptionException {
    LoginResponse loginResponse = client.login(new Login());
    board = loginResponse.getReturn();
    playerName = loginResponse.getPlayerName();
    System.out.println("Player " + playerName);
  }

  public void update() throws RemoteException {
    System.out.println("Getting status update");
    GetStatus getStatus = new GetStatus();
    getStatus.setPlayerName(playerName);
    GetStatusResponse resp = client.getStatus(getStatus);
    game = resp.getReturn();
    Events events = game.getEvents();
    for (BlockEvent blockEvent : events.getBlockEvents()) {
      Point p = blockEvent.getPoint();
      board.getStates().get(p.getX()).getItem().set(p.getY(), blockEvent.getNewState());
      System.out.println("Block new state " + p + " is " + blockEvent.getNewState());
    }
    for (UnitEvent unitEvent : events.getUnitEvents()) {
      Unit unit = unitEvent.getUnit();
      int tickTime = unitEvent.getTickTime();
      Bullet bullet = unitEvent.getBullet();
      System.out.println("Unit event " + unit + " at tick " + tickTime + " bullet " + bullet);
    }

    System.out.println("Current tick: " + game.getCurrentTick());
    if (game.getNextTickTime() == null) {
      System.out.println("Try again in " + RETRY_INTERVAL + "ms");
      timer.schedule(new TimerTask() {
        @Override
        public void run() {
          try {
            update();
          } catch (RemoteException ex) {
            ex.printStackTrace();
            timer.cancel();
          }
        }
      }, RETRY_INTERVAL);
    } else {
      Date nextTickTime = game.getNextTickTime().toGregorianCalendar().getTime();
      System.out.println("Next tick time: " + nextTickTime);
      timer.schedule(new TimerTask() {
        @Override
        public void run() {
          try {
            update();
          } catch (RemoteException ex) {
            ex.printStackTrace();
            timer.cancel();
          }
        }
      }, nextTickTime);
    }
  }

  public static void main(String[] args) throws Exception {
    Client client = new Client("http://localhost:8080/axis2/services/ChallengeService");
    client.login();
    client.update();
  }
}
