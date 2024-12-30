package Command.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/9
 */
public class Client {

  public static void main(String[] args) {
    Order order = new Order();
    order.setTableNum(1);
    order.setFood("disk1", 1);
    order.setFood("disk2", 2);

    Chef chef = new Chef();
    OrderCommand orderCommand = new OrderCommand(chef, order);

    Waitor waitor = new Waitor();
    waitor.setCommand(orderCommand);

    waitor.orderUp();
  }

}
