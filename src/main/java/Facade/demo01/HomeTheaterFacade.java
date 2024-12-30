package Facade.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/12/13
 */
class HomeTheaterFacade {
  private DVDPlayer dvd;
  private Amplifier amp;
  private Projector projector;

  public HomeTheaterFacade(DVDPlayer dvd, Amplifier amp, Projector projector) {
    this.dvd = dvd;
    this.amp = amp;
    this.projector = projector;
  }

  // 统一的接口方法：观看电影
  public void watchMovie(String movie) {
    System.out.println("=== 准备观看电影 ===");
    projector.on();
    amp.on();
    amp.setVolume(5);
    dvd.on();
    projector.setInput(dvd);
    dvd.play(movie);
  }

  // 统一的接口方法：结束观看
  public void endMovie() {
    System.out.println("=== 结束观看电影 ===");
    dvd.off();
    amp.off();
    projector.off();
  }
}

