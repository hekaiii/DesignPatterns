package Composite.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/24
 */
public class client {

  public static void main(String[] args) {
    Department it = new Department("IT");
    it.addComponent(new Deployee("P1", "stuff"));
    it.addComponent(new Deployee("P2", "stuff"));
    it.addComponent(new Deployee("P3", "stuff"));
    it.addComponent(new Deployee("P4", "leader"));
    Department company = new Department("company");
    company.addComponent(it);
    company.showInfo();
//    it.showInfo();
  }

}
