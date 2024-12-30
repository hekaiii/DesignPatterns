package Mediator.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
public abstract class Colleague {
  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void send(String message);
  public abstract void receive(String message);
}
