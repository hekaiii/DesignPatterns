package Adapter.object;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/27
 */
public class tfCardImpl implements tfCard {

  @Override
  public String readTF() {
    return "READ BY TF";
  }

  @Override
  public void writeTF() {

  }
}
