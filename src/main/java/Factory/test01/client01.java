package Factory.test01;

/**
 * @Author: hek32
 * @Description: 简单工厂方法模式
 * @Date: 2024/10/15
 */
public class client01 {

  public static void main(String[] args) {
    SimpleFactory a = SFbuild.build("A");
    a.Build();
  }

}
