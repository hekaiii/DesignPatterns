package Builder.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class TeslaBuilder implements Carbuilder {

  private Car car;

  public TeslaBuilder() {
    this.car = new Car();
  }

  @Override
  public void buildEngine() {
    car.setEngine("tesla engine");
  }

  @Override
  public void buildWheels() {
    car.setWheels("tesla wheels");
  }

  @Override
  public void buildBody() {
    car.setBody("tesla body");
  }

  @Override
  public Car getCar() {
    return car;
  }
}
