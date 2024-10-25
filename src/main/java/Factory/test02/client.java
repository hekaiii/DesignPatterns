package Factory.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class client {

  public static void main(String[] args) {
    SFImplA sfImplA = new SFImplA();
    Product product = sfImplA.Build();
    product.use();
  }

}
