package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/26
 */
public class StudentAggregateImpl implements StudentAggregate {

  ArrayList<Student> students;

  public StudentAggregateImpl(ArrayList<Student> students) {
    this.students = students;
  }

  @Override
  public void addStudent(Student student) {
    students.add(student);
  }

  @Override
  public void removeStudent(Student student) {
    students.remove(student);
  }

  @Override
  public StudentIterator getItserator() {
    StudentIteratorImpl studentIterator = new StudentIteratorImpl(students);
    return studentIterator;
  }
}
