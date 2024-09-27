package adapter.exapmle;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class Banner {

  private String string;

  public Banner(String string) {
    this.string = string;
  }

  public void showWithParen() {
    System.out.println("111"+string+"111");
  }

  public void showWithAster() {
    System.out.println("222"+string+"222");
  }

}
