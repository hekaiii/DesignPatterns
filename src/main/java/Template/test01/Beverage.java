package Template.test01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/10
 */
public abstract class Beverage {
  // 模板方法
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // 具体方法
  private void boilWater() {
    System.out.println("Boiling water");
  }

  private void pourInCup() {
    System.out.println("Pouring into cup");
  }

  // 抽象方法，子类实现
  protected abstract void brew();

  protected abstract void addCondiments();

}
