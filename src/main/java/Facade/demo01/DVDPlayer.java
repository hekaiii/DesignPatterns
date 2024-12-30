package Facade.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
class DVDPlayer {
  public void on() {
    System.out.println("DVD播放器打开");
  }

  public void play(String movie) {
    System.out.println("正在播放电影: " + movie);
  }

  public void off() {
    System.out.println("DVD播放器关闭");
  }
}
