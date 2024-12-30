package Command.demo01;

import java.util.Map;
import java.util.Set;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/9
 */
public class OrderCommand implements Command {

  private Chef chef;

  private Order order;

  public OrderCommand(Chef chef, Order order) {
    this.chef = chef;
    this.order = order;
  }

  @Override
  public void execute() {
    System.out.println("正在做第" + order.getTableNum() + "桌的菜");
    Map<String, Integer> foodDir = order.getFoodDir();
    Set<String> foods = foodDir.keySet();
    for (String food : foods) {
      chef.makeFood(food, foodDir.get(food));
    }
    System.out.println("第" + order.getTableNum() + "桌的菜已完成");
  }
}
