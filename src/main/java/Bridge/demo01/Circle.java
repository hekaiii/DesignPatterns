package Bridge.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/14
 */
public class Circle extends Shape {


  protected Circle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("circle");
    color.fill();
  }
}
