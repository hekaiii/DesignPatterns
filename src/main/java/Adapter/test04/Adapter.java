package Adapter.test04;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class Adapter implements Target{

  Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void paly() {
    adaptee.playTennis();
  }
}
