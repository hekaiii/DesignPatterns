package Iterator.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/27
 */
public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        '}';
  }
}
