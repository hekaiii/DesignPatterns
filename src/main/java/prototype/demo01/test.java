package prototype.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/26
 */
public class test {

  public static void main(String[] args) throws CloneNotSupportedException {
    Citation citation = new Citation(new Student("hekai"));
    Citation clone = citation.clone();
    System.out.println(clone==citation);
    citation.student.setName("test");
    System.out.println(clone.student.getName());
  }
}
