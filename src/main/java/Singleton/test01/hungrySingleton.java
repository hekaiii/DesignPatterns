package Singleton.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class hungrySingleton {

  private static final hungrySingleton entity = new hungrySingleton();

  private hungrySingleton() {
  }

  public static hungrySingleton getEntity() {
    return entity;
  }

}
