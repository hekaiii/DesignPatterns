package Builder.test;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Director {

  private Builder builder;
  public Director(Builder builder) {
    this.builder = builder;
  }

  public Bike construct() {
    builder.buildFrame();
    builder.buildSeat();
    return builder.bike;
  }
}
