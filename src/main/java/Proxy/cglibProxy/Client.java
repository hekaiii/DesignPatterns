package Proxy.cglibProxy;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class Client {
  public static void main(String[] args) {
    ProxyFactory proxyFactory = new ProxyFactory();
    TrainStation proxyObject = proxyFactory.getProxyObject();
    proxyObject.sell("hk");
  }
}
