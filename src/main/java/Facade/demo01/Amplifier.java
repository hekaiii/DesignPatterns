package Facade.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
class Amplifier {
  public void on() {
    System.out.println("功放打开");
  }

  public void setVolume(int level) {
    System.out.println("设置音量: " + level);
  }

  public void off() {
    System.out.println("功放关闭");
  }
}
