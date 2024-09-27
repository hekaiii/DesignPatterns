package Builder.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class test {

  public static void main(String[] args) {
    Carbuilder teslaBuilder = new TeslaBuilder();
    Director director = new Director(teslaBuilder);
    Car construct = director.construct();
    System.out.println(construct);
  }

}
