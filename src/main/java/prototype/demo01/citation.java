package prototype.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/10
 */
public class citation implements Cloneable {

  private Student student;

  public citation(Student student) {
    this.student = student;
  }

  @Override
  protected citation clone() throws CloneNotSupportedException {
    citation c1 = (citation) super.clone();
    c1.student = student.clone();
    return c1;
  }
}
