package Facade.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
class Projector {
  public void on() {
    System.out.println("投影仪打开");
  }

  public void setInput(DVDPlayer dvd) {
    System.out.println("投影仪设置DVD输入");
  }

  public void off() {
    System.out.println("投影仪关闭");
  }
}