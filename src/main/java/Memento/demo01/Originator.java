package Memento.demo01;

/**
 * @Author: hek32
 * @Description:发起者类：可以创建备忘录和恢复状态
 * @Date: 2025/3/11
 */
public class Originator {
  private String state;

  public void setState(String state) {
    this.state = state;
    System.out.println("当前状态: " + state);
  }

  // 创建备忘录
  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  // 从备忘录恢复状态
  public void getStateFromMemento(Memento memento) {
    this.state = memento.getState();
    System.out.println("恢复状态: " + state);
  }
}
