package Facade.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
public class client {

  public static void main(String[] args) {
    DVDPlayer dvd = new DVDPlayer();
    Amplifier amp = new Amplifier();
    Projector projector = new Projector();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, projector);

    // 使用外观模式简化的接口来观看电影
    homeTheater.watchMovie("星际穿越");
    System.out.println("\n电影播放中...\n");
    homeTheater.endMovie();
  }

}
