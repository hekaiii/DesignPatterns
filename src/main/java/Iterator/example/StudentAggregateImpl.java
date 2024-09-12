package Iterator.example;

import java.util.ArrayList;

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
