package Composite.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/23
 */
public class Deployee implements OrganizationComponent {

  private String name;

  private String position;

  public Deployee(String name, String position) {
    this.name = name;
    this.position = position;
  }

  @Override
  public String toString() {
    return     "Deployee{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        '}';
  }

  @Override
  public void showInfo() {
    System.out.println(this.toString());
  }
}
