package Factory.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class FactoryB extends ProductFactory{

  @Override
  public Product createProduct() {
    return new ProductB();
  }
}
