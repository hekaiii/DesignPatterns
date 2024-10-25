package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public abstract class FastFoodDecorator extends FastFood {

  private FastFood fastFood;

  public FastFoodDecorator(FastFood fastFood) {
    this.fastFood = fastFood;
  }

  public FastFood getFastFood() {
    return fastFood;
  }

  public void setFastFood(FastFood fastFood) {
    this.fastFood = fastFood;
  }

  public FastFoodDecorator(int price, String desc, FastFood fastFood) {
    super(price, desc);
    this.fastFood = fastFood;
  }
}
