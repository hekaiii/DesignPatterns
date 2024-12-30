package ChainOfResponsibility.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/1
 */
public class Handler2 extends Handler{

  @Override
  public void handleRequest(Integer request) {
    if (request > 9 && request<20) {
      System.out.println("Handler2:" + request);
    } else if (handler != null) {
      handler.handleRequest(request);
    }
  }
}
