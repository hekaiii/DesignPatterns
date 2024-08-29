package Iterator;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/8/26
 */
public interface StudentAggregate {

  void addStudent(Student student);

  void removeStudent(Student student);

  StudentIterator getItserator();
}
