package Iterator.example;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/26
 */
public class Student {

  private String name;

  private String num;

  public Student() {
  }

  public Student(String name, String num) {
    this.name = name;
    this.num = num;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", num='" + num + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }
}
