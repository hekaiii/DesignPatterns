package Singleton.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/9
 */
public class LazySingleton {

  private volatile static LazySingleton LAZY_SINGLETON;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {

      if (LAZY_SINGLETON == null) {
        synchronized (LazySingleton.class) {
          if (LAZY_SINGLETON == null) {
            LAZY_SINGLETON = new LazySingleton();
          }
        }
      }
      return LAZY_SINGLETON;
  }
}
