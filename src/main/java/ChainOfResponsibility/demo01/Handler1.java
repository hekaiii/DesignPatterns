package ChainOfResponsibility.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/1
 */
public class Handler1 extends Handler {

  @Override
  public void handleRequest(Integer request) {
    if (request < 10) {
      System.out.println("handleRequest:" + request);
    } else if (handler != null) {
      handler.handleRequest(request);
    }
  }
}
