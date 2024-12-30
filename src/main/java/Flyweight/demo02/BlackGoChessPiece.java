package Flyweight.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/25
 */
public class BlackGoChessPiece extends GoChess {

  @Override
  public void draw(int x, int y) {
    System.out.println("黑色色棋子落在" + "(" + x + "," + y + ")");
  }
}
