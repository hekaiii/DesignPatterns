package Singleton.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/8/13
 */
public class hungry {

  private static final hungry INSTANCE = new hungry();

  private hungry() {
  }

  public static hungry getInstance() {
    return INSTANCE;
  }
}
