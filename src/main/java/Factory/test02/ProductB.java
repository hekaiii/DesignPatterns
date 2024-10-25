package Factory.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class ProductB implements Product {

  @Override
  public void use() {
    System.out.println("B-used");
  }
}
