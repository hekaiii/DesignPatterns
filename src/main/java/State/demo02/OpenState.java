package State.demo02;


/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/12
 */
public class OpenState implements ElevatorState{

  @Override
  public void open(ElevatorContext context) {
    System.out.println("门已经打开了");
  }

  @Override
  public void close(ElevatorContext context) {
    System.out.println("门已经关闭了");
    context.setState(new CloseState());
  }

  @Override
  public void stop(ElevatorContext context) {
    System.out.println("电梯门处于打开状态时不能停止电梯");
  }

  @Override
  public void run(ElevatorContext context) {
    System.out.println("电梯门处于打开状态时，不能运行");
  }
}
