package Proxy.StaticProxy;


/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class ProxyPoint implements SellTickets {

  private TrainStation station = new TrainStation();
  @Override
  public void sell() {
    System.out.println("代理点收取费用");
    station.sell();
  }
}
