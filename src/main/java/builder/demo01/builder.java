package builder.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public abstract class builder {

  protected Bike bike = new Bike();

  public abstract void buildFrame();

  public abstract void buildSeat();

  public abstract Bike createBike();
}
