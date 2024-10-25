package Singleton.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class test {

  private test() {

  }

  private static class inner {
    private static final test entity = new test();
  }

  public static test getInstance() {
    return inner.entity;
  }


}
