package Decorator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class SugarDecorator extends BeverageDecorator {

  public SugarDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public Integer price() {
    return beverage.price() + 1;
  }

  @Override
  public String getDesc() {
    return beverage.getDesc() + "加奶";
  }
}
