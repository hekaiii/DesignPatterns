package Proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class ProxyFactory implements InvocationHandler{

  private TrainStation trainStation = new TrainStation();
  public SellTickets getProxyObject() {
    SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
        trainStation.getClass()
            .getClassLoader(),
        trainStation.getClass().getInterfaces(),
        this);
    return proxyObject;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //这种方式在AOP中使用切片 在各个方法前后增加切片然后写方法来实现
    System.out.println("代理工程开始代理方法");
    Object invoke = method.invoke(trainStation, args);
    return invoke;
  }
}
