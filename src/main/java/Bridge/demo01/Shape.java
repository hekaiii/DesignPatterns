package Bridge.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/14
 */
public abstract class Shape {

  protected Color color;

  protected Shape(Color color) {
    this.color = color;
  }

  abstract void draw();
}
