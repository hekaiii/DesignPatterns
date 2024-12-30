package State.demo02;


/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/12
 */
public class StopState implements ElevatorState {

  @Override
  public void open(ElevatorContext context) {
    System.out.println("电梯门打开");
    context.setState(new OpenState());
  }

  @Override
  public void close(ElevatorContext context) {
    System.out.println("电梯门关闭");
    context.setState(new CloseState());
  }

  @Override
  public void stop(ElevatorContext context) {
    System.out.println("正处于关闭状态");
  }

  @Override
  public void run(ElevatorContext context) {
    System.out.println("电梯开始运行");
    context.setState(new RunState());
  }
}
