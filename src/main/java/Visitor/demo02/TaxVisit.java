package Visitor.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class TaxVisit implements Visit{

  @Override
  public void visit(Food food) {
    double total = food.getNums() * food.getPrice();
    System.out.println("食物最终价格："+total);
  }

  @Override
  public void visit(Electronics electronics) {
    double total = electronics.getNums() * electronics.getPrice();
    System.out.println("电子设备最终价格："+total);
  }
}
