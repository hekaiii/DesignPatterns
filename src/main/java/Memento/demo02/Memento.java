package Memento.demo02;

/**
 * @Author: hek32
 * @Description: 备忘录
 * @Date: 2025/3/11
 */
public class Memento {

  final private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
