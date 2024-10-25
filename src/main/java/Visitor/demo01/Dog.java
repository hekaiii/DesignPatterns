package Visitor.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class Dog implements Animal {

  @Override
  public void accept(Person person) {
    person.feed(this);
    System.out.println("汪汪汪");
  }
}
