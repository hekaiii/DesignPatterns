package Bridge.demo04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class CountDisplay extends Display{

  public CountDisplay(DisplayImpl display) {
    super(display);
  }

  public void count(int time) {
    Open();
    for (int i = 0; i < time; i++) {
      print();
    }
    close();
  }
}
