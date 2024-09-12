package builder.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Bike {

  private String frame;
  private String seat;

  public String getFrame() {
    return frame;
  }

  public void setFrame(String frame) {
    this.frame = frame;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  @Override
  public String toString() {
    return "Bike{" +
        "frame='" + frame + '\'' +
        ", seat='" + seat + '\'' +
        '}';
  }
}
