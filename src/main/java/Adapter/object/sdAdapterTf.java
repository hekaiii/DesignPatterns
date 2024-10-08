package Adapter.object;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class sdAdapterTf implements sdCard {

  private tfCard tfCard;

  public sdAdapterTf(tfCard tfCard) {
    this.tfCard = tfCard;
  }

  @Override
  public String readSD() {
    return tfCard.readTF();
  }

  @Override
  public void writeSD() {
    tfCard.readTF();
  }
}
