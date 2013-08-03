package za.co.entelect.challenge;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class GUI extends JFrame implements Runnable {

  private static final Logger logger = Logger.getLogger(GUI.class);

  public static final int DEFAULT_WIDTH = 500;
  public static final int DEFAULT_HEIGHT = 520;

  private ChallengeServiceSkeleton server;
  private double zoomFactor;
  private Canvas canvas;

  public GUI(ChallengeServiceSkeleton server, double zoomFactor) {
    this.server = server;
    this.zoomFactor = zoomFactor;
    setIgnoreRepaint(true);
    setTitle("BATTLEMATRIX SERVER");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    canvas = new Canvas();
    canvas.setIgnoreRepaint(true);
    canvas.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    add(canvas);
    pack();
  }

  public void run() {
    canvas.createBufferStrategy(2);

    BufferStrategy buffer = canvas.getBufferStrategy();
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gd = ge.getDefaultScreenDevice();
    GraphicsConfiguration gc = gd.getDefaultConfiguration();
    BufferedImage bi = gc.createCompatibleImage(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    Graphics graphics = null;
    Graphics2D g = null;

    while (true) {
      try {
        g = bi.createGraphics();

        g.setColor(Color.darkGray);
        g.fillRect(0, 0, getWidth(), getHeight());

        AffineTransform t = g.getTransform();
        g.scale(zoomFactor, zoomFactor);

        for (int j = 0; j < server.getHeight(); j++) {
          for (int i = 0; i < server.getWidth(); i++) {
            if (server.hasWall(i, j)) {
              g.setColor(Color.lightGray);
              g.fillRect(i, j, 1, 1);
            }
          }
        }

        Player player1 = server.getPlayer1();
        g.setColor(Color.orange);
        Base b1 = player1.getBase();
        if (b1 != null) {
          g.fillRect(b1.getX(), b1.getY(), 1, 1);
        }
        for (Unit unit : player1.getUnits()) {
          Rectangle rect = new Rectangle(unit.getY() - 2, unit.getX() + 2, unit.getY() + 2, unit.getX() - 2);
          g.setColor(Color.orange);
          g.fillRect(rect.getLeft(), rect.getTop(), 5, 5);

          int turretX = -1;
          int turretY = -1;
          switch (unit.getDirection()) {
            case UP:
              turretX = unit.getX();
              turretY = unit.getY() - 2;
              break;
            case RIGHT:
              turretX = unit.getX() + 2;
              turretY = unit.getY();
              break;
            case DOWN:
              turretX = unit.getX();
              turretY = unit.getY() + 2;
              break;
            case LEFT:
              turretX = unit.getX() - 2;
              turretY = unit.getY();
              break;
          }
          g.setColor(Color.orange.darker());
          g.fillRect(turretX, turretY, 1, 1);
        }
        for (Bullet bullet : player1.getBullets()) {
          g.setColor(Color.orange.brighter());
          g.fillRect(bullet.getX(), bullet.getY(), 1, 1);
        }

        Player player2 = server.getPlayer2();
        g.setColor(Color.green);
        Base b2 = player2.getBase();
        if (b2 != null) {
          g.fillRect(b2.getX(), b2.getY(), 1, 1);
        }
        for (Unit unit : player2.getUnits()) {
          Rectangle rect = new Rectangle(unit.getY() - 2, unit.getX() + 2, unit.getY() + 2, unit.getX() - 2);
          g.setColor(Color.green);
          g.fillRect(rect.getLeft(), rect.getTop(), 5, 5);

          int turretX = -1;
          int turretY = -1;
          switch (unit.getDirection()) {
            case UP:
              turretX = unit.getX();
              turretY = unit.getY() - 2;
              break;
            case RIGHT:
              turretX = unit.getX() + 2;
              turretY = unit.getY();
              break;
            case DOWN:
              turretX = unit.getX();
              turretY = unit.getY() + 2;
              break;
            case LEFT:
              turretX = unit.getX() - 2;
              turretY = unit.getY();
              break;
          }
          g.setColor(Color.green.darker());
          g.fillRect(turretX, turretY, 1, 1);
        }
        for (Bullet bullet : player2.getBullets()) {
          g.setColor(Color.green.brighter());
          g.fillRect(bullet.getX(), bullet.getY(), 1, 1);
        }

        g.setTransform(t);

        graphics = buffer.getDrawGraphics();
        graphics.drawImage(bi, 0, 0, null);
        if (!buffer.contentsLost()) {
          buffer.show();
        }

        try {
          Thread.sleep(33);
        } catch (InterruptedException ex) {
          logger.warn("Thread interrupted", ex);
        }
      } finally {
        if (graphics != null) {
          graphics.dispose();
        }

        if (g != null) {
          g.dispose();
        }
      }
    }
  }
}
