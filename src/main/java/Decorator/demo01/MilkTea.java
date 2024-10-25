package Decorator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class MilkTea implements Beverage{

  @Override
  public Integer price() {
    return 3;
  }

  @Override
  public String getDesc() {
    return "milk tea";
  }
}
