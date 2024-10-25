package Factory.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class ProductA implements Product {

  @Override
  public void use() {
    System.out.println("A-used");
  }
}
