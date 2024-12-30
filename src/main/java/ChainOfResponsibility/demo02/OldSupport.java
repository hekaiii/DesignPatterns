package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public class OldSupport extends Support{

  public OldSupport(String name) {
    super(name);
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
}
