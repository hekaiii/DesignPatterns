package Builder.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Director {

  private builder builder;

  public Director(builder builder) {
    this.builder = builder;
  }

  public Bike construct() {
    builder.buildFrame();
    builder.buildSeat();
    return builder.createBike();
  }
}
