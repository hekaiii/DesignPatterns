package Factory.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class ProductA implements Product {


  @Override
  public void use() {
    System.out.println("ProductA.use");
  }
}
