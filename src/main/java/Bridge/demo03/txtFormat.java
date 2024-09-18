package Bridge.demo03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public class txtFormat implements reportFormat {


  @Override
  public void export() {
    System.out.println("txt Export");
  }
}
