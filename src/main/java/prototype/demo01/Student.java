package prototype.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/10
 */
public class Student implements Cloneable {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }
}
