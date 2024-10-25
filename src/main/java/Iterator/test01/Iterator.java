package Iterator.test01;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/22
 */
public interface Iterator<T> {

  Boolean hasNext();

  T next();

}
