package Strategy.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/23
 */
public class client {

  public static void main(String[] args) {
    Display display = new Display(new StrategyB());
    display.HowToShow();
  }

}
