package ChainOfResponsibility.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/1
 */
public abstract class Handler {

  protected Handler handler;

  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  public abstract void handleRequest(Integer request);
}
