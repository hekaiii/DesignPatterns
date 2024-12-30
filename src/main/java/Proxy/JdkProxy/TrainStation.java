package Proxy.JdkProxy;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class TrainStation implements SellTickets {

  @Override
  public void sell(String name) {
    System.out.println("火车站卖票,乘车人" + name);
  }

  @Override
  public void query() {
    System.out.println("正在查询余票");
  }
}
