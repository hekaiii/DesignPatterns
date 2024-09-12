package Singleton.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/9
 */
public class test {

  public static void main(String[] args) throws Exception {
    Constructor<LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor(null);
    declaredConstructor.setAccessible(true);
    LazySingleton lazySingleton = declaredConstructor.newInstance();
    Field test = LazySingleton.class.getField("test");
    test.setAccessible(true);

  }
}
