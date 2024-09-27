package Builder.test;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Bike {

  private String seat;
  private String frame;

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public String getFrame() {
    return frame;
  }

  public void setFrame(String frame) {
    this.frame = frame;
  }

  @Override
  public String toString() {
    return "Bike{" +
        "seat='" + seat + '\'' +
        ", frame='" + frame + '\'' +
        '}';
  }
}
