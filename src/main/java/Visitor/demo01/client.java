package Visitor.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class client {
  public static void main(String[] args) {
    Home home = new Home();
    home.addAnimal(new Dog());
    home.addAnimal(new Cat());
    home.action(new Owner());
  }
}
