package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class FriedNoodles extends FastFood{

  public FriedNoodles() {
    super(12, "FriedNoodles");
  }

  @Override
  public int cost() {
    return super.getPrice();
  }

}
