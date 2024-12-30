package Mediator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
class User extends Colleague {
  private String name;

  public User(String name, Mediator mediator) {
    super(mediator);
    this.name = name;
  }

  @Override
  public void send(String message) {
    System.out.println(this.name + " sends: " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(this.name + " receives: " + message);
  }
}

