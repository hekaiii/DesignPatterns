package Builder.test02;

/**
 * @Author: hek32
 * @Description: 使用内部类完成构造者设计模式
 * @Date: 2024/9/26
 */
public class Car {

  private String Engine;
  private String Wheels;
  private String Body;

  public Car(CarBuilder carBuilder) {
    this.Engine = carBuilder.Engine;
    this.Wheels = carBuilder.Wheels;
    this.Body = carBuilder.Body;
  }

  @Override
  public String toString() {
    return "Car{" +
        "Engine='" + Engine + '\'' +
        ", Wheels='" + Wheels + '\'' +
        ", Body='" + Body + '\'' +
        '}';
  }

  public static class CarBuilder {
    private String Engine;
    private String Wheels;
    private String Body;

    public CarBuilder Engine(String engine) {
      this.Engine = engine;
      return this;
    }
    public CarBuilder Wheels(String Wheels) {
      this.Wheels = Wheels;
      return this;
    }
    public CarBuilder Body(String Body) {
      this.Body = Body;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}
