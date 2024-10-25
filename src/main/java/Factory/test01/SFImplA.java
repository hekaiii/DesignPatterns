package Factory.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class SFImplA implements SimpleFactory{

  @Override
  public void Build() {
    System.out.println("SimpleFactory-01");
  }
}
