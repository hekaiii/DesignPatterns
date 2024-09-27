package Factory.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class ProductB implements Product{

  @Override
  public void use() {
    System.out.println("ProductB.use");
  }
}
