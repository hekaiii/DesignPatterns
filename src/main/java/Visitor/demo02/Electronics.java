package Visitor.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class Electronics implements items{

  private double price;

  private double nums;

  public Electronics(double price, double nums) {
    this.price = price;
    this.nums = nums;
  }

  public double getPrice() {
    return price;
  }

  public double getNums() {
    return nums;
  }


  @Override
  public void accept(Visit visit) {
    visit.visit(this);
  }
}
