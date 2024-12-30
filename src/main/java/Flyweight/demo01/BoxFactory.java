package Flyweight.demo01;

import java.util.HashMap;
import javax.swing.Box;

/**
 * @Author: hek32
 * @Description: 将该类设置为单例
 * @Date: 2025/3/25
 */
public class BoxFactory {

  private HashMap<String, AbstractBox> map ;
  private static BoxFactory factory = new BoxFactory();
  //构造方法中进行初始化
  public BoxFactory() {
    map = new HashMap<String, AbstractBox>();
    map.put("I", new IBox());
    map.put("Z", new ZBox());
    map.put("L", new LBox());
  }
  public static BoxFactory getInstance() {
    return factory;
  }

  public AbstractBox getShape(String name) {
    return map.get(name);
  }
}
