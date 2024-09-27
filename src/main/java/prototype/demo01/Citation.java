package prototype.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/10
 */
public class Citation implements Cloneable {

  Student student;

  public Citation(Student student) {
    this.student = student;
  }

  @Override
  protected Citation clone() throws CloneNotSupportedException {
    Citation c1 = (Citation) super.clone();
    //所有组合的类都重写了clone方法，进行组装，那么就是深拷贝
    c1.student = student.clone();
    return c1;
  }
}
