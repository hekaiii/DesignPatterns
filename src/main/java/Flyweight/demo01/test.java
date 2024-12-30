package Flyweight.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/25
 */
public class test {

  public static void main(String[] args) {
    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2);
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);
  }
}
