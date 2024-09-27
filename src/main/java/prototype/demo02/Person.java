package prototype.demo02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.print.DocFlavor.STRING;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/10
 */
public class Person implements Serializable {

  private String name;
  private int age;
  private Adress adress;
  //使用反序列化完成对象的clone
  public Person deepClone() {
    try {
      ByteArrayOutputStream bos  = new ByteArrayOutputStream();
      ObjectOutputStream oos  = new ObjectOutputStream(bos);
      oos.writeObject(this);

      ByteArrayInputStream bis  = new ByteArrayInputStream(bos.toByteArray());
      ObjectInputStream ois  = new ObjectInputStream(bis);
      Object o = ois.readObject();
      return (Person) o;

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  public Person(String name, int age, Adress adress) {
    this.name = name;
    this.age = age;
    this.adress = adress;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Adress getAdress() {
    return adress;
  }

  public void setAdress(Adress adress) {
    this.adress = adress;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", adress=" + adress +
        '}';
  }
}
