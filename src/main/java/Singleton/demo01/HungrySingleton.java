package Singleton.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/9
 */
public class HungrySingleton {
  private static final HungrySingleton hungrySingleton = new HungrySingleton();
  private HungrySingleton() {
  }
  public static HungrySingleton getInstance() {
    return hungrySingleton;
  }

}
