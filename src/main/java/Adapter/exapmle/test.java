package Adapter.exapmle;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class test {

  public static void main(String[] args) {
    Target target = new PrinterBanner(new Banner("text"));
    target.printStrong();
    target.printWeak();
  }
}
