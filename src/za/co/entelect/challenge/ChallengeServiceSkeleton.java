
/**
 * ChallengeServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package za.co.entelect.challenge;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.service.Lifecycle;
import org.apache.commons.io.FileUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ChallengeServiceSkeleton java skeleton for the axisService
 */
public class ChallengeServiceSkeleton implements Lifecycle {

  public static final AtomicInteger ID_GEN = new AtomicInteger();
  public static final long TICK_INTERVAL = 1000;
  public static final String PLAYER1_NAME = "player1";
  public static final String PLAYER2_NAME = "player2";
  public static final File OUTPUT_DIR = new File("/tmp/bm");
  public static final boolean ENABLE_OUTPUT_DIR = false;

  private int width;
  private int height;
  private Timer timer;
  private Board board;
  private Game game;
  private List<Player> players;
  private Player player1 = new Player();
  private Player player2 = new Player();
  private List<StateArray> stateArrays;

  private Map<Unit, Player> units = new HashMap<>();
  private Map<Bullet, Player> bulletPlayer = new HashMap<>();
  private Map<Unit, Bullet> bulletUnit = new HashMap<>();
  private Map<Integer, Action> actions = new HashMap<>();

  private Events player1Events = new Events();
  private Events player2Events = new Events();

  private boolean gameOver;
  private Player winner;

  public ChallengeServiceSkeleton() {
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Timer getTimer() {
    return timer;
  }

  public Board getBoard() {
    return board;
  }

  public Game getGame() {
    return game;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public List<StateArray> getStateArrays() {
    return stateArrays;
  }

  public Map<Unit, Player> getUnits() {
    return units;
  }

  public Map<Bullet, Player> getBulletPlayer() {
    return bulletPlayer;
  }

  public Map<Unit, Bullet> getBulletUnit() {
    return bulletUnit;
  }

  public Map<Integer, Action> getActions() {
    return actions;
  }

  public Events getPlayer1Events() {
    return player1Events;
  }

  public Events getPlayer2Events() {
    return player2Events;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public Player getWinner() {
    return winner;
  }

  @Override
  public void init(ServiceContext serviceContext) throws AxisFault {
    GUI app = new GUI(this, 5);
    app.setVisible(true);
    Thread gameThread = new Thread(app);
    gameThread.start();

    try {
      FileUtils.forceDelete(OUTPUT_DIR);
      FileUtils.forceMkdir(OUTPUT_DIR);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    System.out.println("Started, get output in " + OUTPUT_DIR);
    gameOver = false;
    timer = new Timer();

    Util.ParsedMap parsedMap = Util.mapFromResource(Util.DEMO_MAP_RESOURCE);
    width = parsedMap.width;
    height = parsedMap.height;
    parsedMap.unit1.setId(ID_GEN.incrementAndGet());
    parsedMap.unit2.setId(ID_GEN.incrementAndGet());
    parsedMap.unit3.setId(ID_GEN.incrementAndGet());
    parsedMap.unit4.setId(ID_GEN.incrementAndGet());

    board = new Board();
    board.setStates(parsedMap.stateArrays);
    stateArrays = parsedMap.stateArrays;

    game = new Game();
    players = game.getPlayers();
    player1.setName(PLAYER1_NAME);
    player1.setBase(parsedMap.base1);
    player1.getUnits().add(parsedMap.unit1);
    units.put(parsedMap.unit1, player1);
    player1.getUnits().add(parsedMap.unit2);
    units.put(parsedMap.unit2, player1);
    player2.setName(PLAYER2_NAME);
    player2.setBase(parsedMap.base2);
    player2.getUnits().add(parsedMap.unit3);
    units.put(parsedMap.unit3, player2);
    player2.getUnits().add(parsedMap.unit4);
    units.put(parsedMap.unit4, player2);
  }

  @Override
  public void destroy(ServiceContext serviceContext) {
    System.out.println("Stopped");
    timer.cancel();
  }

  public GetStatusResponse getStatus(GetStatus getStatus) {
    GetStatusResponse resp = new GetStatusResponse();
    if (PLAYER1_NAME.equals(getStatus.getPlayerName())) {
      game.setEvents(player1Events);
      player1Events = new Events();
    } else if (PLAYER2_NAME.equals(getStatus.getPlayerName())) {
      game.setEvents(player2Events);
      player2Events = new Events();
    }
    resp.setReturn(game);
    return resp;
  }

  public SetActionResponse setAction(SetAction setAction)
    throws EndOfGameExceptionException {
    if (gameOver) {
      throw new EndOfGameExceptionException("Game is over, player [" + winner + "] won!");
    }
    actions.put(setAction.arg0, setAction.arg1);
    return new SetActionResponse();
  }

  public LoginResponse login(Login login)
    throws NoBlameExceptionException, EndOfGameExceptionException {
    LoginResponse resp = new LoginResponse();
    resp.setReturn(board);

    if (players.size() == 0) {
      players.add(player1);
      resp.setPlayerName(player1.getName());
      System.out.println(player1.getName() + " logged in");
    } else if (players.size() == 1) {
      players.add(player2);
      resp.setPlayerName(player2.getName());
      System.out.println(player2.getName() + " logged in");
      timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
          update();

          game.setCurrentTick(game.getCurrentTick() + 1);
          GregorianCalendar c = new GregorianCalendar();
          c.setTime(new Date(System.currentTimeMillis() + TICK_INTERVAL));
          try {
            game.setNextTickTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
          } catch (DatatypeConfigurationException ex) {
            throw new RuntimeException("Problem with calendar", ex);
          };
        }
      }, 0, TICK_INTERVAL);
    } else {
      throw new NoBlameExceptionException("Game full");
    }
    return resp;
  }

  public Player getPlayer1() {
    return player1;
  }

  public Player getPlayer2() {
    return player2;
  }

  /**
   * Game rules
   * 1) Bullets that have been fired are moved and collisions are checked for.
   * Looking at rules 1 and 2 bullets need to be moved twice per round
   * 2) Bullets and tanks are moved and collision are checked for.
   * 3) All tankoperator in the firing state are fired and their bullets are added to the field.
   * 4) Collisions are checked for.
   */
  public void update() {
    if (ENABLE_OUTPUT_DIR) {
      try(FileWriter fileWriter = new FileWriter(new File(OUTPUT_DIR, "bm-" + game.getCurrentTick() + ".ppm"))) {
        String ppm = Util.toPpm(board, this, width, height);
        fileWriter.write(ppm);
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }

    if (gameOver) {
      timer.cancel();
      return;
    }

    System.out.println("Update current tick " + game.getCurrentTick());
    for (Map.Entry<Integer, Action> entry : actions.entrySet()) {
      int unit = entry.getKey();
      Action action = entry.getValue();
      System.out.println("Unit " + unit + " action " + action);

    }
    for (int i = 0; i < 2; i++) {
      updateBullets();
    }
    updateTanks();
    fireTanks();
  }

  private void updateBullets() {
    List<Bullet> bullets = new ArrayList<>();
    bullets.addAll(player1.getBullets());
    bullets.addAll(player2.getBullets());

    for (Bullet bullet : bullets) {
      int x = bullet.getX();
      int y = bullet.getY();
      switch (bullet.getDirection()) {
        case UP:
          y--;
          break;
        case RIGHT:
          x++;
          break;
        case DOWN:
          y++;
          break;
        case LEFT:
          x--;
          break;
      }
      if (x < 0 || y < 0 || x > width - 1 || y > height - 1) {
        for (Map.Entry<Unit, Bullet> unitBulletEntry : bulletUnit.entrySet()) {
          if (unitBulletEntry.getValue() == bullet) {
            bulletUnit.remove(unitBulletEntry.getKey());
            Player player = bulletPlayer.remove(bullet);
            player.getBullets().remove(bullet);
            // TODO: create bullet event
          }
        }
      } else {
        bullet.setX(x);
        bullet.setY(y);
        Collision collision = checkEntityCollision(bullet);
        if (collision != null) {
          // TODO: create bullet event
          Player owner = bulletPlayer.remove(bullet);
          owner.getBullets().remove(bullet);
          switch (collision.type) {
            case BulletBase:
              gameOver = true;
              Base base = (Base) collision.target;
              if (base == player1.getBase()) {
                winner = player2;
              } else {
                winner = player1;
              }
              return;
            case BulletBullet:
              Bullet obullet = (Bullet) collision.target;
              Player oowner = bulletPlayer.remove(obullet);
              oowner.getBullets().remove(obullet);
              break;
            case BulletTank:
              Unit tank = (Unit) collision.target;
              Player towner = units.remove(tank);
              towner.getUnits().remove(tank);
              break;
            case BulletWall:
              destroyWalls(x, y, bullet.getDirection());
              break;
          }
        }
      }
    }
  }

  public boolean hasWall(int x, int y) {
    return stateArrays.get(y).getItem().get(x) == State.FULL;
  }

  public void destroyWalls(int x, int y, Direction direction) {
    if (hasWall(x, y)) {
      stateArrays.get(y).getItem().set(x, State.EMPTY);
      player1Events.getBlockEvents().add(new BlockEvent(State.EMPTY, new Point(x, y)));
      player2Events.getBlockEvents().add(new BlockEvent(State.EMPTY, new Point(x, y)));
      if (direction == Direction.UP || direction == Direction.DOWN) {
        if (destroyIfNeighborWall(x - 1, y)) {
          destroyIfNeighborWall(x - 2, y);
        }
        if (destroyIfNeighborWall(x + 1, y)) {
          destroyIfNeighborWall(x + 2, y);
        }
      } else {
        if (destroyIfNeighborWall(x, y - 1)) {
          destroyIfNeighborWall(x, y - 2);
        }
        if (destroyIfNeighborWall(x, y + 1)) {
          destroyIfNeighborWall(x, y + 2);
        }
      }
    }
  }

  private boolean destroyIfNeighborWall(int x, int y) {
    if (!isInBounds(x, y)) {
      return false;
    }

    if (hasWall(x, y)) {
      stateArrays.get(y).getItem().set(x, State.EMPTY);
      player1Events.getBlockEvents().add(new BlockEvent(State.EMPTY, new Point(x, y)));
      player2Events.getBlockEvents().add(new BlockEvent(State.EMPTY, new Point(x, y)));
      return true;
    }
    return false;
  }

  public boolean isInBounds(int x, int y) {
    return x >= 0 && x < width && y >= 0 && y < height;
  }

  private void updateTanks() {
    List<Unit> tanks = new ArrayList<>();
    tanks.addAll(player1.getUnits());
    tanks.addAll(player2.getUnits());
    for (Unit tank : tanks) {
      Action nextAction = actions.get(tank.getId());
      if (nextAction == Action.UP || nextAction == Action.RIGHT || nextAction == Action.DOWN || nextAction == Action.LEFT) {
        switch (nextAction) {
          case UP:
            if (tank.getDirection() != Direction.UP) {
              tank.setDirection(Direction.UP);
              continue;
            }
            break;
          case RIGHT:
            if (tank.getDirection() != Direction.RIGHT) {
              tank.setDirection(Direction.RIGHT);
              continue;
            }
            break;
          case DOWN:
            if (tank.getDirection() != Direction.DOWN) {
              tank.setDirection(Direction.DOWN);
              continue;
            }
            break;
          case LEFT:
            if (tank.getDirection() != Direction.LEFT) {
              tank.setDirection(Direction.LEFT);
              continue;
            }
            break;
        }
        int oldX = tank.getX();
        int oldY = tank.getY();

        int x = tank.getX();
        int y = tank.getY();
        Direction direction = tank.getDirection();
        Rectangle rect = new Rectangle(y - 2, x + 2, y + 2, x - 2);
        switch (nextAction) {
          case UP:
            direction = Direction.UP;
            if (canMoveInDirection(tank, Direction.UP)) {
              y--;
              rect.translate(0, -1);
            }
            break;
          case RIGHT:
            direction = Direction.RIGHT;
            if (canMoveInDirection(tank, Direction.RIGHT)) {
              x++;
              rect.translate(1, 0);
            }

            break;
          case DOWN:
            direction = Direction.DOWN;
            if (canMoveInDirection(tank, Direction.DOWN)) {
              y++;
              rect.translate(0, 1);
            }

            break;
          case LEFT:
            direction = Direction.LEFT;
            if (canMoveInDirection(tank, Direction.LEFT)) {
              x--;
              rect.translate(-1, 0);
            }
            break;
        }

        tank.setDirection(direction);
        if (rect.getLeft() >= 0 && rect.getRight() < width
          && rect.getTop() >= 0 && rect.getBottom() < height) {
          if (x != oldX || y != oldY) {
            tank.setX(x);
            tank.setY(y);
            Collision collision = checkEntityCollision(tank);
            if (collision != null) {
              switch (collision.type) {
                case TankBase:
                  gameOver = true;
                  Base base = (Base) collision.target;
                  if (base == player1.getBase()) {
                    winner = player2;
                  } else {
                    winner = player1;
                  }
                  return;
                case TankBullet:
                  Bullet bullet = (Bullet) collision.target;
                  Player player = bulletPlayer.remove(bullet);
                  player.getBullets().remove(bullet);

                  player = units.remove(tank);
                  player.getUnits().remove(tank);
                  break;
                default:
                  tank.setX(oldX);
                  tank.setY(oldY);
                  break;
              }
            } else {
              moveTank(tank);
            }
          }
        }
      }
    }
  }

  private void moveTank(Unit tank) {
    UnitEvent e = new UnitEvent();
    e.setUnit(tank);
    e.setTickTime(game.getCurrentTick());
    e.setBullet(bulletUnit.get(tank));
    player1Events.getUnitEvents().add(e);
    player2Events.getUnitEvents().add(e);
  }

  public Object getEntityAt(int x, int y) {
    for (Unit unit : player1.getUnits()) {
      Rectangle rect = new Rectangle(unit.getY() - 2, unit.getX() + 2, unit.getY() + 2, unit.getX() - 2);
      if (rect.contains(x, y)) {
        return unit;
      }
    }
    for (Unit unit : player2.getUnits()) {
      Rectangle rect = new Rectangle(unit.getY() - 2, unit.getX() + 2, unit.getY() + 2, unit.getX() - 2);
      if (rect.contains(x, y)) {
        return unit;
      }
    }
    for (Bullet unit : player1.getBullets()) {
      if (unit.getX() == x && unit.getX() == y) {
        return unit;
      }
    }
    for (Bullet unit : player2.getBullets()) {
      if (unit.getX() == x && unit.getX() == y) {
        return unit;
      }
    }
    if (player1.getBase().getX() == x && player1.getBase().getY() == y) {
      return player1.getBase();
    }
    if (player2.getBase().getX() == x && player2.getBase().getY() == y) {
      return player2.getBase();
    }
    return null;
  }

  public boolean canTankBeMovedTo(Unit tank, int x, int y) {
    for (int j = y - 2; j <= y + 2; j++) {
      for (int i = x - 2; i <= x + 2; i++) {
        if (!isInBounds(i, j)) {
          return false;
        }

        if (hasWall(i, j)) {
          return false;
        }
        Object entity = getEntityAt(i, j);
        if (entity != null
          && tank != entity
          && entity instanceof Unit) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean canMoveInDirection(Unit tank, Direction dir) {
    int x = tank.getX();
    int y = tank.getY();
    switch (dir) {
      case UP:
        return canTankBeMovedTo(tank, x, y - 1);
      case RIGHT:
        return canTankBeMovedTo(tank, x + 1, y);
      case DOWN:
        return canTankBeMovedTo(tank, x, y + 1);
      case LEFT:
        return canTankBeMovedTo(tank, x - 1, y);
    }
    return false;
  }

  private void fireTanks() {
    List<Unit> tanks = new ArrayList<>();
    tanks.addAll(player1.getUnits());
    tanks.addAll(player2.getUnits());
    for (Unit tank : tanks) {
      boolean canFire = !bulletUnit.containsKey(tank);
      Action nextAction = actions.get(tank.getId());
      if (canFire && nextAction == Action.FIRE) {
        int bulletX = -1;
        int bulletY = -1;
        switch (tank.getDirection()) {
          case UP:
            bulletX = tank.getX();
            bulletY = tank.getY() - 3;
            break;
          case RIGHT:
            bulletX = tank.getX() + 3;
            bulletY = tank.getY();
            break;
          case DOWN:
            bulletX = tank.getX();
            bulletY = tank.getY() + 3;
            break;
          case LEFT:
            bulletX = tank.getX() - 3;
            bulletY = tank.getY();
            break;
        }
        Bullet bullet = new Bullet();
        bullet.setX(bulletX);
        bullet.setY(bulletY);
        bullet.setDirection(tank.getDirection());
        if (isInBounds(bullet.getX(), bullet.getY())) {
          int id = ID_GEN.incrementAndGet();
          bullet.setId(id);
          bulletUnit.put(tank, bullet);
          Object entity = getEntityAt(bulletX, bulletY);
          if (hasWall(bulletX, bulletY)) {
            destroyWalls(bulletX, bulletY, bullet.getDirection());
          } else if (entity != null) {
            if (entity instanceof Base) {
              gameOver = true;
              if (entity == player1.getBase()) {
                winner = player2;
              } else {
                winner = player1;
              }
              return;
            } else if (entity instanceof Bullet) {
              bulletUnit.remove(((Bullet) entity).getId());
              Player player = bulletPlayer.remove(entity);
              player.getBullets().remove(entity);
            } else if (entity instanceof Unit) {
              Player player = units.remove(entity);
              player.getUnits().remove(entity);
            }
          } else {
            if (player1.getUnits().contains(tank)) {
              player1.getBullets().add(bullet);
            } else {
              player2.getBullets().add(bullet);
            }
            bulletUnit.put(tank, bullet);
          }
        }
      }
    }
  }

  private Collision checkEntityCollision(Bullet bullet) {
    if (hasWall(bullet.getX(), bullet.getY())) {
      return new Collision(bullet, null, CollisionType.BulletWall);
    }

    Object e = getEntityAt(bullet.getX(), bullet.getY());
    if (e != null && e != bullet) {
      return handleCollision(bullet, e);
    }
    return null;
  }

  private Collision checkEntityCollision(Unit tank) {
    Rectangle rect = new Rectangle(tank.getY() - 2, tank.getX() + 2, tank.getY() + 2, tank.getX() - 2);
    switch (tank.getDirection()) {
      case UP:
        for (int i = rect.getLeft(); i <= rect.getRight(); i++) {
          Object e = getEntityAt(i, rect.getTop());
          if (e != null && e != tank) {
            return handleCollision(tank, e);
          }
        }
        break;
      case RIGHT:
        for (int j = rect.getTop(); j <= rect.getBottom(); j++) {
          Object e = getEntityAt(rect.getRight(), j);
          if (e != null && e != tank) {
            return handleCollision(tank, e);
          }
        }
        break;
      case DOWN:
        for (int i = rect.getLeft(); i <= rect.getRight(); i++) {
          Object e = getEntityAt(i, rect.getBottom());
          if (e != null && e != tank) {
            return handleCollision(tank, e);
          }
        }
        break;
      case LEFT:
        for (int j = rect.getTop(); j <= rect.getBottom(); j++) {
          Object e = getEntityAt(rect.getLeft(), j);
          if (e != null && e != tank) {
            return handleCollision(tank, e);
          }
        }
        break;
    }
    return null;
  }

  private Collision handleCollision(Object s, Object t) {
    CollisionType type = CollisionType.NonDestructive;
    if (s instanceof Bullet && t instanceof Base) {
      type = CollisionType.BulletBase;
    } else if (s instanceof Unit && t instanceof Base) {
      type = CollisionType.TankBase;
    } else if (s instanceof Bullet && t instanceof Unit) {
      type = CollisionType.BulletTank;
    } else if (s instanceof Unit && t instanceof Bullet) {
      type = CollisionType.TankBullet;
    } else if (s instanceof Bullet && t instanceof Bullet) {
      type = CollisionType.BulletBullet;
    }
    return new Collision(s, t, type);
  }

  public enum CollisionType {
    BulletBase, TankBase, BulletTank, TankBullet, BulletBullet, BulletWall, NonDestructive
  }


  private static class Collision {
    public Object source;
    public Object target;
    public CollisionType type;

    public Collision(Object source, Object target, CollisionType type) {
      this.source = source;
      this.target = target;
      this.type = type;
    }
  }
}
    