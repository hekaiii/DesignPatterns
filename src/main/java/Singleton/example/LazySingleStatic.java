package Singleton.example;



/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class LazySingleStatic {

  private LazySingleStatic() {
  }

  private static class InnerClass {
    private static final LazySingleStatic STATIC = new LazySingleStatic();
  }
  public LazySingleStatic getInstance() {
    return InnerClass.STATIC;
  }
}
