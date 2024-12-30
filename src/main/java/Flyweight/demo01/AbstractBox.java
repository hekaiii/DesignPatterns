package Flyweight.demo01;

/**
 * @Author: hek32
 * @Description: 抽象享元
 * @Date: 2025/3/25
 */
public abstract class AbstractBox {

  //获取图形
  public abstract String getShape();

  //显示图形及颜色
  public void display(String color) {
    System.out.println("方形：" + getShape() + "，颜色：" + color);
  }
}
