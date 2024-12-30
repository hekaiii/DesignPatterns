package Mediator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
public class client {
  public static void main(String[] args) {
    Mediator mediator = new ChatMediator();

    Colleague user1 = new User("Alice", mediator);
    Colleague user2 = new User("Bob", mediator);
    Colleague user3 = new User("Charlie", mediator);

    mediator.registerColleague(user1);
    mediator.registerColleague(user2);
    mediator.registerColleague(user3);

    user1.send("Hello, everyone!");
    user2.send("Hi, Alice!");
  }
}
