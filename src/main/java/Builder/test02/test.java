package Builder.test02;

import Builder.test02.Car.CarBuilder;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class test {

  public static void main(String[] args) {
    Car car = new Car.CarBuilder()
        .Body("body")
        .Engine("engine1")
        .Wheels("wheels")
        .build();
    System.out.println(car);
  }
}
