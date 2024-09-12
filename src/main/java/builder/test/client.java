package builder.test;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class client {

  public static void main(String[] args) {

    Mobike mobike = new Mobike();
    Director director = new Director(mobike);
    Bike bike = director.construct();
    System.out.println(bike.toString());
  }
}
