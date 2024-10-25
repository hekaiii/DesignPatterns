package Adapter.test04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class client {

  public static void main(String[] args) {
    Target target = new Adapter(new Adaptee());
    target.paly();
  }

}
