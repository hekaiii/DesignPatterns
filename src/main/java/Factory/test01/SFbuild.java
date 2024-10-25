package Factory.test01;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/15
 */
public class SFbuild {

  public static SimpleFactory build(String text) {
    if (Objects.equals(text, "A")) {
      return new SFImplA();
    } else if (Objects.equals(text, "B")) {
      return new SFImplB();
    } else {
      return null;
    }
  }

}
