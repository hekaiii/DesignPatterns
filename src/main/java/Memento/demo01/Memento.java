package Memento.demo01;

/**
 * @Author: hek32
 * @Description:备忘录类：存储状态
 * @Date: 2025/3/11
 */
public class Memento {
  private final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
