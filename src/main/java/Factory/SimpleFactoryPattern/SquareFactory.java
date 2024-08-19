package Factory.SimpleFactoryPattern;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/19
 */
public class SquareFactory implements ShapeFactory{

  @Override
  public Shape CreateShape() {
    return new Square();
  }
}
