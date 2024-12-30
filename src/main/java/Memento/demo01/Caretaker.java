package Memento.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description: 负责人：存储备忘录
 * @Date: 2025/3/11
 */
public class Caretaker {
  private final List<Memento> mementoList = new ArrayList<>();

  public void add(Memento state) {
    mementoList.add(state);
  }

  public Memento get(int index) {
    return mementoList.get(index);
  }
}
