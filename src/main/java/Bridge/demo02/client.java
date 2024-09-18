package Bridge.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public class client {

  public static void main(String[] args) {
    Circle circle = new Circle(new BigSize());
    circle.draw();
  }
}
