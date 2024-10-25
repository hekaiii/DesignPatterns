package Strategy.test01;

import java.util.Stack;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/23
 */
public class Display {

  Strategy strategy;

  public Display(Strategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void HowToShow() {
    strategy.show();
  }
}
