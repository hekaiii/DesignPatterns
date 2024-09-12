package builder.demo03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class client {

  public static void main(String[] args) {
    Phone phone = new Phone.Build()
        .cpu("cpu")
        .mainBoard("mainBoard")
        .screen("screen")
        .memory("memory")
        .build();
    System.out.println(phone.toString());
  }
}
