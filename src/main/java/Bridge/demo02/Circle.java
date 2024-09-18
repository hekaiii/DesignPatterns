package Bridge.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public class Circle extends Shape {


  public Circle(Size size) {
    super(size);
  }

  @Override
  void draw() {
    size.sizeBig();
    System.out.println("circle");
  }
}
