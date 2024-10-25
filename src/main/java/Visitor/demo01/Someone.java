package Visitor.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class Someone implements Person{

  @Override
  public void feed(Dog dog) {
    System.out.println("陌生人喂狗");
  }

  @Override
  public void feed(Cat cat) {
    System.out.println("陌生人喂猫");
  }
}
