package Builder.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class Director {

  private Carbuilder builder;

  public Director(Carbuilder builder) {
    this.builder = builder;
  }

  public Car construct() {
    builder.buildBody();
    builder.buildEngine();
    builder.buildWheels();
    return builder.getCar();
  }
}
