package Template.test03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/8/12
 */
public class child extends father{

  @Override
  public void step1() {
    System.out.println("s1");
  }

  @Override
  public void step2() {
    System.out.println("s2");
  }

  @Override
  public void step3() {
    System.out.println("s3");
  }

  @Override
  public boolean hook() {
    return true;
  }
}
