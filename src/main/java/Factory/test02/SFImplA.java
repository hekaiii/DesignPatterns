package Factory.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class SFImplA implements SimpleFactory {

  @Override
  public Product Build() {
    return new ProductA();
  }
}
