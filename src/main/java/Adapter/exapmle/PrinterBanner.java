package Adapter.exapmle;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/25
 */
public class PrinterBanner implements Target {

  Banner banner;

  public PrinterBanner(Banner banner) {
    this.banner = banner;
  }


  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
