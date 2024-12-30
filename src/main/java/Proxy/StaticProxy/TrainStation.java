package Proxy.StaticProxy;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class TrainStation implements SellTickets {

  @Override
  public void sell() {
    System.out.println("火车站卖票");
  }
}
