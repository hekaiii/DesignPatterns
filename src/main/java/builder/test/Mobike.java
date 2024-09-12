package builder.test;

import builder.demo03.Phone.Build;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Mobike extends Builder {


  @Override
  public void buildSeat() {
    bike.setSeat("seat");
  }

  @Override
  public void buildFrame() {
    bike.setFrame("frame");
  }

  @Override
  public Bike createBike() {
    return bike;
  }
}
