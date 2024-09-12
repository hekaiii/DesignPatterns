package Factory.AbstractFactory;

import Factory.Factory.Product;
import Factory.Factory.ProductA;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public class DeployerFactoryA implements DeployeFactory {


  @Override
  public Enviroment buildEnv() {
    return new EnvA();
  }

  @Override
  public Product buildProduct() {
    return new ProductA();
  }
}
