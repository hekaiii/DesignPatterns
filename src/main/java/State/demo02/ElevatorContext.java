package State.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/12
 */
public class ElevatorContext {

  private ElevatorState state;

  public ElevatorContext(ElevatorState state) {
    this.state = new CloseState();
  }

  public void setState(ElevatorState state) {
    this.state = state;
  }

  public void open() {
    state.open(this);
  }
  public void close() {
    state.close(this);
  }
  public void run() {
    state.run(this);
  }
  public void stop() {
    state.stop(this);
  }
}
