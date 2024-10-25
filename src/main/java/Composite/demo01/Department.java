package Composite.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/23
 */
public class Department implements OrganizationComponent{

  private String name;

  private List<OrganizationComponent> list = new ArrayList<>();

  public Department(String name) {
    this.name = name;
  }

  public void addComponent(OrganizationComponent component) {
    list.add(component);
  }

  public void removeComponent(OrganizationComponent component) {
    list.remove(component);
  }

  @Override
  public void showInfo() {
    System.out.println("DepartmentName" + name);
    for (OrganizationComponent component : list) {
      component.showInfo();
    }
  }
}
