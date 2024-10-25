package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class EggFried extends FastFoodDecorator{

  public EggFried(FastFood fastFood) {
    super(1,"炒鸡蛋",fastFood);
  }

  public EggFried(int price, String desc, FastFood fastFood) {
    super(price, desc, fastFood);
  }

  @Override
  public int cost() {
    return getPrice() + getFastFood().getPrice();
  }
}
