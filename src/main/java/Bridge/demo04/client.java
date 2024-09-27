package Bridge.demo04;

import Bridge.demo01.RedColor;

/**
 * @Author: hek32
 * @Description: 结城浩书中的方法
 * @Date: 2024/9/26
 */
public class client {

  public static void main(String[] args) {
    StringDisplayImpl stringDisplay = new StringDisplayImpl();
    CountDisplay countDisplay = new CountDisplay(stringDisplay);
    countDisplay.count(3);
  }

}
