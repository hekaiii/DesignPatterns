package Factory.AbstractFactory;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/6
 */
public class EnvB implements Enviroment {

  @Override
  public void build() {
    System.out.println("build envA");
  }
}
