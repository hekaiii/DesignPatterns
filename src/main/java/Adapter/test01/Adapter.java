package Adapter.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/27
 */
public class Adapter implements Target {

  private Banner banner;

  public Adapter(Banner banner) {
    this.banner = banner;
  }

  @Override
  public void eatLargely() {
    banner.eat();
  }

  @Override
  public void drinkLargely() {
    banner.drink();
  }
}
