package adapter.object;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class Computer {

  public String readSd(sdCard sdCard) {
    if (sdCard == null) {
      throw new NullPointerException("sdcard is not null");
    }
    return sdCard.readSD();
  }
}
