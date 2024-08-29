package Iterator;

import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/26
 */
public class StudentIteratorImpl implements StudentIterator {

  List<Student> students;
  int cursor = 0;

  public StudentIteratorImpl(List<Student> students) {
    this.students = students;
  }

  @Override
  public Boolean hasNext() {
    return cursor < students.size();
  }

  @Override
  public Student next() {
    Student student = students.get(cursor++);
    return student;
  }
}
