package Visitor.demo01;

import java.util.ArrayList;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public class Home {

  ArrayList<Animal> list = new ArrayList<>();

  public void addAnimal(Animal animal) {
    list.add(animal);
  }

  public void action(Person person) {
    for (Animal animal : list) {
      animal.accept(person);
    }
  }
}
