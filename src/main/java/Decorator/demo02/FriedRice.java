package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class FriedRice extends FastFood{

  public FriedRice() {
    super(10, "FriedRice");
  }

  @Override
  public int cost() {
    return super.getPrice();
  }

}
