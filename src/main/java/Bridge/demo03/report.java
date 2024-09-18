package Bridge.demo03;


/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public abstract class report {

  protected reportFormat format;

  public report(reportFormat format) {
    this.format = format;
  }

  public abstract void generate();
}
