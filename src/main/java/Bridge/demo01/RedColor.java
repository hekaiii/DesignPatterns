package Bridge.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/14
 */
public class RedColor implements Color {


  @Override
  public void fill() {
    System.out.println("red");
  }
}
