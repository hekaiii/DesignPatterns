package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class BaconFried extends FastFoodDecorator{

  public BaconFried(FastFood fastFood) {
    super(fastFood);
  }

  public BaconFried(int price, String desc, FastFood fastFood) {
    super(price, desc, fastFood);
  }

  @Override
  public int cost() {
    return getPrice() + 2;
  }
}
