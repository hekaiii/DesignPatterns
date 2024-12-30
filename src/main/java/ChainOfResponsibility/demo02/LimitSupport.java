package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public class LimitSupport extends Support {

  private Integer limit;

  public LimitSupport(String name,Integer limit) {
    super(name);
    this.limit = limit;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() < limit) {
      return true;
    } else {
      return false;
    }
  }
}
