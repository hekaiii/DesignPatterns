package Factory.SimpleFactoryPattern;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/19
 */
public class test {

  public static void main(String[] args) {
    ShapeFactory circleFactory = new CircleFactory();
    Shape circle = circleFactory.CreateShape();
    circle.draw();
    SquareFactory squareFactory = new SquareFactory();
    Shape square = squareFactory.CreateShape();
    square.draw();
  }
}
