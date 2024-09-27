package Bridge.demo04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class StringDisplayImpl implements DisplayImpl{

  @Override
  public void rawOpen() {
    System.out.println("rawOpen");
  }

  @Override
  public void rawPrint() {
    System.out.println("rawPrint");
  }

  @Override
  public void rawClose() {
    System.out.println("rawClose");
  }
}
