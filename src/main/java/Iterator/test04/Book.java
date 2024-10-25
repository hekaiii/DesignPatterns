package Iterator.test04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class Book {

  private String Name;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public Book(String name) {
    Name = name;
  }

  @Override
  public String toString() {
    return "Book{" +
        "Name='" + Name + '\'' +
        '}';
  }
}
