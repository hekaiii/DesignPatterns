package Iterator.test03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
 */
public class Book {

  private String name;

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

  public Book(String name) {
    this.name = name;
  }


}
