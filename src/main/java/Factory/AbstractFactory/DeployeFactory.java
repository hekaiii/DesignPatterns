package Factory.AbstractFactory;

import Factory.Factory.Product;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public interface DeployeFactory {

  Enviroment buildEnv();

  Product buildProduct();
}
