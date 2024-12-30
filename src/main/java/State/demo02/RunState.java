package State.demo02;

import State.demo02.ElevatorState;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/12
 */
public class RunState implements ElevatorState{

  @Override
  public void open(ElevatorContext context) {
    System.out.println("处于运行状态的电梯不能开门");
  }

  @Override
  public void close(ElevatorContext context) {
    System.out.println("处于运行状态的电梯门是关着的");
  }

  @Override
  public void stop(ElevatorContext context) {
    System.out.println("已经停止");
    context.setState(new StopState());
  }

  @Override
  public void run(ElevatorContext context) {
    System.out.println("正处于运行状态");
  }
}
