package Factory.Factory;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public class ProductFactory {

  public static Product creator(String type) {
    if ("ProductA".equals(type)) {
      return new ProductA();
    } else if ("ProductB".equals(type)) {
      return new ProductB();
    } else {
      return null;
    }
  }
}
