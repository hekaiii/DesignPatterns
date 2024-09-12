package Factory.AbstractFactory;

import Factory.Factory.Product;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public class client {

  public static void main(String[] args) {
    DeployerFactoryA factoryA = new DeployerFactoryA();
    Enviroment enviroment = factoryA.buildEnv();
    Product product = factoryA.buildProduct();
    enviroment.build();
    product.use();
  }
}
