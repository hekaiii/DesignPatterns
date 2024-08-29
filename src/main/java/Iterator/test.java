package Iterator;

import java.util.ArrayList;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/26
 */
public class test {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("test1","001"));
    students.add(new Student("test2","002"));
    students.add(new Student("test3","003"));
    students.add(new Student("test4","004"));
    StudentAggregateImpl studentAggregate = new StudentAggregateImpl(students);
    StudentIterator itserator = studentAggregate.getItserator();
    while (itserator.hasNext()) {
      Student stu = itserator.next();
      System.out.println(stu.toString());
    }
  }
}
