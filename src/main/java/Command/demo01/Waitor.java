package Command.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/9
 */
public class Waitor {

  private List<Command> commandList = new ArrayList<>();

  public void setCommand(Command command) {
    this.commandList.add(command);
  }

  public void orderUp() {
    System.out.println("订单来了");
    for (Command command : commandList) {
      if (command != null) {
        command.execute();
      }
    }
  }
}
