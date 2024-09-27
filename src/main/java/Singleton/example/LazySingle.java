package Singleton.example;

import Singleton.demo01.LazySingleton;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class LazySingle {

  private static volatile LazySingle lazySingle = null;

  private LazySingle() {
  }

  public static LazySingle getInstance() {
    if (lazySingle == null) {
      synchronized (LazySingle.class) {
        if (lazySingle == null) {
          lazySingle = new LazySingle();
          return lazySingle;
        }
      }
    }
    return lazySingle;
  }
}
