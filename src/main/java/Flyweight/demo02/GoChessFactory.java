package Flyweight.demo02;

import State.demo02.CloseState;
import com.sun.xml.internal.bind.WhiteSpaceProcessor;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/25
 */
public class GoChessFactory {

  private static final HashMap<String, GoChess> map = new HashMap<>();

  static{
    map.put("black", new BlackGoChessPiece());
    map.put("white", new WhileGoChessPiece());
  }

  public static GoChess getPiece(String color) {
    return map.get(color.toLowerCase());
  }

}
