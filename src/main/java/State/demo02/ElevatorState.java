package State.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/12
 */
public interface ElevatorState {
  void open(ElevatorContext context);
  void close(ElevatorContext context);
  void stop(ElevatorContext context);
  void run(ElevatorContext context);
}
