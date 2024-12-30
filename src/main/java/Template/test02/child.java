package Template.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class child extends father{

  private Integer count = 0;

  @Override
  public void firstStep() {
    System.out.println("firstStep");
  }

  @Override
  public void secondStep() {
    System.out.println("secondStep");
  }

  @Override
  public void thirdStep() {
    System.out.println("thirdStep");
  }

  @Override
  public Boolean hook() {
    if (count++ < 5) {
      return true ;
    }
    return false;
  }
}
