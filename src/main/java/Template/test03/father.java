package Template.test03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/8/12
 */
public abstract class father {

  public final void construct() {
    step1();
    step2();
    step3();
  }

  public abstract void step1();
  public abstract void step2();
  public abstract void step3();
  public boolean hook() {
    return true;
  }
}
