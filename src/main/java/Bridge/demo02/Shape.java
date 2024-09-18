package Bridge.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public abstract class Shape {

  protected Size size;

  public Shape(Size size) {
    this.size = size;
  }

  abstract void draw();
}
