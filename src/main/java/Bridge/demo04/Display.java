package Bridge.demo04;

import java.nio.file.OpenOption;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class Display {

  protected DisplayImpl display;

  public Display(DisplayImpl display) {
    this.display = display;
  }

  void Open() {
    display.rawOpen();
  }
  void print() {
    display.rawPrint();
  }
  void close() {
    display.rawClose();
  }

  public final void display() {
    Open();
    print();
    close();
  }
}
