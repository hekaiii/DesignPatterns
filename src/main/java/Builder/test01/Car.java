package Builder.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class Car {

  private String engine;
  private String wheels;
  private String body;

  public Car() {
  }

  public Car(String engine, String wheels, String body) {
    this.engine = engine;
    this.wheels = wheels;
    this.body = body;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getWheels() {
    return wheels;
  }

  public void setWheels(String wheels) {
    this.wheels = wheels;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Car{" +
        "engine='" + engine + '\'' +
        ", wheels='" + wheels + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
