package Adapter.classWay;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class test {

  public static void main(String[] args) {
    Computer computer = new Computer();
    String s = computer.readSd(new sdCardImpl());
    System.out.println(s);

    String s1 = computer.readSd(new sdAdapterTf());
    System.out.println(s1);

  }
}
