package Singleton.test01;

import javax.swing.text.html.parser.Entity;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class LazySingletonStatic {
  private LazySingletonStatic() {

  }

  private static class innerClass {
    private static final LazySingletonStatic entity = new LazySingletonStatic();
  }

  public static LazySingletonStatic getEntity() {
    return innerClass.entity;
  }
}
