package Factory.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class test {

  public static void main(String[] args) {
    ProductFactory factoryA = new FactoryA();
    Product productA = factoryA.createProduct();
    productA.use();

    ProductFactory factoryB = new FactoryB();
    Product productB = factoryB.createProduct();
    productB.use();
  }

}
