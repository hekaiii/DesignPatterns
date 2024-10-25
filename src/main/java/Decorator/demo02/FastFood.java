package Decorator.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public abstract class FastFood {

  private int price;

  private String desc;

  public FastFood() {
  }

  public FastFood(int price, String desc) {
    this.price = price;
    this.desc = desc;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public abstract int cost();
}
