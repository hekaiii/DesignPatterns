package Memento.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description: 备忘录收藏夹 一个备忘录只能记录一个状态 备忘录夹可以保存多个备忘录
 * @Date: 2025/3/11
 */
public class Caretaker {
  private final List<Memento> mementoList = new ArrayList<>();

  void addMemento(Memento memento) {
    mementoList.add(memento);
  }

  Memento getMemento(Integer index) {
    return mementoList.get(index);
  }
}
