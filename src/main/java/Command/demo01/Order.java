package Command.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/9
 */
public class Order {

  private int TableNum;

  private Map<String, Integer> foodDir = new HashMap<>();

  public int getTableNum() {
    return TableNum;
  }

  public void setTableNum(int tableNum) {
    TableNum = tableNum;
  }

  public Map<String, Integer> getFoodDir() {
    return foodDir;
  }

  public void setFood(String name, Integer num) {
    foodDir.put(name, num);
  }
}
