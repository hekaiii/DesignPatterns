package Proxy.cglibProxy;

import java.lang.reflect.Method;
import javax.xml.transform.Source;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/26
 */
public class ProxyFactory implements MethodInterceptor {

  private TrainStation trainStation = new TrainStation();

  public TrainStation getProxyObject() {
    //创建enhancer对象 类似于jdk代理中的proxy类 用来获取代理对象的类
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(TrainStation.class);
    enhancer.setCallback(this);
    TrainStation o = (TrainStation) enhancer.create();
    return o;
  }

  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {
    Object invoke = method.invoke(trainStation, args);
    return invoke;
  }
}
