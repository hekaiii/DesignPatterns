package Observer.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/10
 */
public class ConcreteObs implements Observer{

  private String name;

  public ConcreteObs(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println(name + ":" + message);
  }
}
