package Decorator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class Coffee implements Beverage{

  @Override
  public Integer price() {
    return 2;
  }

  @Override
  public String getDesc() {
    return "Coffee";
  }
}
