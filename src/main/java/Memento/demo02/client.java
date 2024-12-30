package Memento.demo02;

import Builder.test01.Car;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/11
 */
public class client {

  public static void main(String[] args) {
    Originator man = new Originator();
    Caretaker caretaker = new Caretaker();

    man.setState("状态1");
    caretaker.addMemento(man.saveStateToMemento());
    man.setState("状态2");
    caretaker.addMemento(man.saveStateToMemento());
    man.setState("状态3");
    caretaker.addMemento(man.saveStateToMemento());

    man.getStateFromMemento(caretaker.getMemento(1));
    man.getStateFromMemento(caretaker.getMemento(0));
  }
}
