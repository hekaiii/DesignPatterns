package builder.demo02;

import builder.demo02.MobikeBuilder;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class client {

  public static void main(String[] args) {
    MobikeBuilder mobikeBuilder = new MobikeBuilder();
    Bike bike  = mobikeBuilder.construct();
    System.out.println(bike.toString());
  }
}
