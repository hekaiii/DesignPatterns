package Adapter.object;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class sdCardImpl implements sdCard {

  @Override
  public String readSD() {
    return "READ BY SD";
  }

  @Override
  public void writeSD() {

  }
}
