package Adapter.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/27
 */
public class test {
  public static void main(String[] args) {
    Target target = new Adapter(new Banner());
    target.drinkLargely();
    target.eatLargely();
  }
}
