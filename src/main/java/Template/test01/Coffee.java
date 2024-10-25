package Template.test01;

import java.sql.SQLOutput;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
 */
public class Coffee extends Beverage {

  @Override
  protected void brew() {
    System.out.println("Brewing coffee grounds");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
}
