package Visitor.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public interface Person {
  void feed(Dog dog);
  void feed(Cat cat);
}
