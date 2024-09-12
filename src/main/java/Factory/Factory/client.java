package Factory.Factory;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public class client {

  public static void main(String[] args) {
    Product productA = ProductFactory.creator("ProductA");
    productA.use();
  }

}
