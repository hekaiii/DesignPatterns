package builder.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class client {

  public static void main(String[] args) {
    Director director = new Director(new MobikeBuilder());
    Bike bike = director.construct();
    System.out.println(bike.toString());
  }
}
