package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class client {

  public static void main(String[] args) {
    FastFood friedRice = new FriedRice();
    friedRice = new EggFried(friedRice);
    System.out.println(friedRice.cost());
  }

}
