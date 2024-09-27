package Singleton.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class HungrySingle {

  private static final HungrySingle single = new HungrySingle();

  private HungrySingle() {
  }

  public static HungrySingle getInstance() {
    return single;
  }
}
