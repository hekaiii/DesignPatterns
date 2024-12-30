package Memento.demo02;

/**
 * @Author: hek32
 * @Description: 试用备忘录的人 可以把状态存入备忘录
 * @Date: 2025/3/11
 */
public class Originator {

  private String state;

  void setState(String state) {
    System.out.println("保存当前状态: " + state);
    this.state = state;
  }

  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  public void getStateFromMemento(Memento memento) {
    this.state = memento.getState();
    System.out.println("恢复状态: " + state);
  }
}
