package Adapter.classWay;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class sdAdapterTf extends tfCardImpl implements sdCard {

  @Override
  public String readSD() {
    return readTF();
  }

  @Override
  public void writeSD() {
    readTF();
  }
}
