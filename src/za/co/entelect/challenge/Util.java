package za.co.entelect.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;

public class Util {

  public static final String COLOR_PPM3_BLANK = "0 0 0";
  public static final String COLOR_PPM3_BULLET = "255 255 255";
  public static final String COLOR_PPM3_TANK_PLAYER1 = "0 0 255";
  public static final String COLOR_PPM3_TANK_PLAYER2 = "255 0 0";
  public static final String COLOR_PPM3_WALL = "120 120 120";

  public static final String DEMO_MAP_RESOURCE = "/demoMap1.txt";

  public static ParsedMap mapFromResource(String resourceName) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(Util.class.getResourceAsStream(resourceName)));
    StringBuilder builder = new StringBuilder();
    try {
      String line = reader.readLine();
      while (line != null) {
        builder.append(line + "\n");
        line = reader.readLine();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    ParsedMap parsedMap = mapFromString(builder.toString());
    System.out.println("Loaded resource [" + resourceName + "] with content [" + builder.toString() + "]");
    return parsedMap;
  }

  public static ParsedMap mapFromString(String desc) {
    String[] lines = desc.split("\n");
    String[] dims = lines[0].split(" ");
    int w = Integer.parseInt(dims[0]);
    int h = Integer.parseInt(dims[1]);

    ParsedMap parsedMap = new ParsedMap();
    parsedMap.width = w;
    parsedMap.height = h;
    List<StateArray> stateArrays = new ArrayList<>();
    for (int j = 1; j < h + 1; j++) {
      StateArray stateArray = new StateArray();
      String line = lines[j];
      for (int i = 0; i < w; i++) {
        char c = line.charAt(i);
        State state = State.EMPTY;
        switch (c) {
          case 'w':
            state = State.FULL;
            break;
          case 'x':
            parsedMap.base1 = new Base(i, j - 1);
            break;
          case 'y':
            parsedMap.base2 = new Base(i, j - 1);
            break;
          case '1':
            parsedMap.unit1 = new Unit(i, j - 1);
            break;
          case '2':
            parsedMap.unit2 = new Unit(i, j - 1);
            break;
          case '3':
            parsedMap.unit3 = new Unit(i, j - 1);
            break;
          case '4':
            parsedMap.unit4 = new Unit(i, j - 1);
            break;
        }
        stateArray.getItem().add(state);
      }
      stateArrays.add(stateArray);
    }
    parsedMap.stateArrays = stateArrays;
    return parsedMap;
  }

  public static class ParsedMap {
    int width;
    int height;
    List<StateArray> stateArrays;
    Base base1;
    Base base2;
    Unit unit1;
    Unit unit2;
    Unit unit3;
    Unit unit4;
  }

  public static String toPpm(Board board, ChallengeServiceSkeleton server, int width, int height) {
    Player player1 = server.getPlayer1();
    List<StateArray> stateArrays = board.getStates();
    StringBuilder buffer = new StringBuilder();
    buffer.append("P3\n");
    buffer.append(width + " " + height + "\n");
    buffer.append("255\n");
    for (int y = 0; y < height; y++) {
      StateArray stateArray = stateArrays.get(y);
      for (int x = 0; x < width; x++) {
        State state = stateArray.getItem().get(x);
        if (state == State.FULL) {
          buffer.append(COLOR_PPM3_WALL);
        } else {
          Object e = server.getEntityAt(x, y);
          if (e == null) {
            buffer.append(COLOR_PPM3_BLANK);
          } else if (e instanceof Base) {
            buffer.append(player1.getBase() == e ? COLOR_PPM3_TANK_PLAYER1 : COLOR_PPM3_TANK_PLAYER2);
          } else if (e instanceof Bullet) {
            buffer.append(COLOR_PPM3_BULLET);
          } else if (e instanceof Unit) {
            buffer.append(player1.getUnits().contains(e) ? COLOR_PPM3_TANK_PLAYER1 : COLOR_PPM3_TANK_PLAYER2);
          }
        }
        buffer.append(" ");
      }
      buffer.append("\n");
    }
    return buffer.toString();
  }
}
