package Singleton.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/9
 */
public class LazySingletonStatic {

  private LazySingletonStatic() {
  }

  private static class InnerSingleton {
    private static final LazySingletonStatic inner = new LazySingletonStatic();
  }

  public LazySingletonStatic getInstance() {
    return InnerSingleton.inner;
  }
}
