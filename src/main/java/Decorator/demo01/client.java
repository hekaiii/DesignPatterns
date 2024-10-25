package Decorator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class client {

  public static void main(String[] args) {
    Beverage coffee = new Coffee();
//    System.out.println(coffee.getDesc());
//    System.out.println(coffee.price());
    coffee = new MochaDecorator(coffee);
    System.out.println(coffee.price());
  }

}
