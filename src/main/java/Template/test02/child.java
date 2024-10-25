package Template.test02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class child extends father{


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
    return true ;
  }


}
