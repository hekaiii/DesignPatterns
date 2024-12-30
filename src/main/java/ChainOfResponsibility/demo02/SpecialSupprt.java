package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public class SpecialSupprt extends Support {

  private Integer number;

  public SpecialSupprt(String name,Integer integer) {
    super(name);
    this.number = integer;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() == null) {
      return true;
    } else {
      return false;
    }
  }
}
