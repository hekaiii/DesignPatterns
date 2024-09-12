package builder.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class MobikeBuilder extends builder {


  @Override
  public void buildFrame() {
    bike.setFrame("mobi车架");
  }

  @Override
  public void buildSeat() {
    bike.setSeat("mobi座椅");
  }

  @Override
  public Bike createBike() {
    return bike;
  }
}
