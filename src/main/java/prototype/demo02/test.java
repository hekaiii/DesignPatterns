package prototype.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class test {

  public static void main(String[] args) {
    Adress adress = new Adress("nanjing","lushan");
    Person person = new Person("hekai",29,adress);
    Person person1 = person.deepClone();
    System.out.println(person1==person);
    person1.setAge(30);
    System.out.println(person1.getAge());
    System.out.println(person.getAge());
  }
}
