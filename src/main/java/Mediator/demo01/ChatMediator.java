package Mediator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
public class ChatMediator implements Mediator {
  private List<Colleague> colleagues = new ArrayList<>();

  @Override
  public void sendMessage(String message, Colleague sender) {
    for (Colleague colleague : colleagues) {
      // 防止消息发送给自己
      if (colleague != sender) {
        colleague.receive(message);
      }
    }
  }

  @Override
  public void registerColleague(Colleague colleague) {
    colleagues.add(colleague);
  }
}
