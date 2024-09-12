package builder.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class OfoBuilder extends builder {


  @Override
  public void buildFrame() {
    bike.setFrame("ofo车架");
  }

  @Override
  public void buildSeat() {
    bike.setSeat("ofo座椅");
  }

  @Override
  public Bike createBike() {
    return bike;
  }
}
