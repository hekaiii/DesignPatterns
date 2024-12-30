package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public class Trouble {

  private Integer number;

  public Trouble(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Trouble{" +
        "number=" + number +
        '}';
  }
}
