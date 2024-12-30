package ChainOfResponsibility.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/1
 */
public class client {
  public static void main(String[] args) {
    Handler1 handler1 = new Handler1();
    Handler2 handler2 = new Handler2();
    Handler3 handler3 = new Handler3();
//    handler2.setHandler(handler3);
//    handler1.setHandler(handler2);
//    handler3.setHandler(handler1);

    int[] list = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15, 21, 22, 30};
    for (int i : list) {
      handler1.handleRequest(i);
    }
  }
}
