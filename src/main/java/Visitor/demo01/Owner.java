package Visitor.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class Owner implements Person{

  @Override
  public void feed(Dog dog) {
    System.out.println("主人喂狗");
  }

  @Override
  public void feed(Cat cat) {
    System.out.println("主人喂猫");
  }
}
