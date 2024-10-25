package Visitor.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class client {

  public static void main(String[] args) {
    TaxVisit taxVisit = new TaxVisit();
    DiscountVisit discountVisit = new DiscountVisit();
    Food food = new Food(10, 5);
    Electronics electronics = new Electronics(10, 5);
    food.accept(taxVisit);
    electronics.accept(taxVisit);

    food.accept(discountVisit);
    electronics.accept(discountVisit);
  }

}
