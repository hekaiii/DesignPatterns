package Builder.test;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public abstract class Builder {

  public Bike bike = new Bike();

  public abstract void buildSeat();
  public abstract void buildFrame();
  public abstract Bike createBike();
}
