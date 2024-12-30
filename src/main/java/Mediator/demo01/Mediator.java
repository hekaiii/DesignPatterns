package Mediator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
interface Mediator {
  void sendMessage(String message, Colleague sender);
  void registerColleague(Colleague colleague);
}

