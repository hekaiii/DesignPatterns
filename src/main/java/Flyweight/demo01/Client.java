package Flyweight.demo01;

import javax.swing.Box;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/25
 */
public class Client {

  public static void main(String[] args) {
    AbstractBox i = BoxFactory.getInstance().getShape("I");
    i.display("白色");
    AbstractBox l = BoxFactory.getInstance().getShape("L");
    i.display("蓝色");
    AbstractBox z1 = BoxFactory.getInstance().getShape("Z");
    i.display("彩色");
    AbstractBox z2 = BoxFactory.getInstance().getShape("Z");
    i.display("黑白");
    System.out.println(z1 == z2);
  }
}
