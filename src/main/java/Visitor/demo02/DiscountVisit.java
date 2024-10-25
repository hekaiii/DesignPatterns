package Visitor.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class DiscountVisit implements Visit{

  @Override
  public void visit(Food food) {
    System.out.println("食品打折后的单价是：" + food.getPrice() * 0.98);
  }

  @Override
  public void visit(Electronics electronics) {
    System.out.println("电子产品打折后的单价是：" + electronics.getPrice() * 0.9);
  }
}
