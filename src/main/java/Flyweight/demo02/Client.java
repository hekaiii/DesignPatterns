package Flyweight.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/25
 */
public class Client {

  public static void main(String[] args) {
    GoChess black = GoChessFactory.getPiece("black");
    GoChess white = GoChessFactory.getPiece("white");

    black.draw(1, 2);
    white.draw(2,2);
    black.draw(1, 3);
    white.draw(2,3);

    System.out.println(black == white);

  }

}
