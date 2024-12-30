package Template.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public abstract class father {

  public final void construct() {
    firstStep();
    while (hook()) {
        secondStep();
    }
    thirdStep();
  }

  protected abstract void firstStep();
  protected abstract void secondStep();
  protected abstract void thirdStep();
  protected abstract Boolean hook();

}
