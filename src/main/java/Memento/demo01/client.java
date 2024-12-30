package Memento.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/11
 */
public class client {
  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    // 设置状态，并保存到备忘录
    originator.setState("状态1");
    caretaker.add(originator.saveStateToMemento());

    originator.setState("状态2");
    caretaker.add(originator.saveStateToMemento());

    originator.setState("状态3");
    System.out.println("当前状态: " + originator.saveStateToMemento().getState());

    // 恢复到之前的状态
    originator.getStateFromMemento(caretaker.get(0));  // 恢复到状态1
    originator.getStateFromMemento(caretaker.get(1));  // 恢复到状态2
  }
}
