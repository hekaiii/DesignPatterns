package Singleton.test01;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import javax.xml.stream.events.EndElement;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
//double check lock
public class lazySingleton {

  private volatile static lazySingleton entity = null;

  private lazySingleton() {
  }

  public static lazySingleton getEntity() {
    if (entity == null) {
      synchronized (lazySingleton.class) {
        if (entity == null) {
          return entity = new lazySingleton();
        }
      }
    }
    return entity;
  }
}
