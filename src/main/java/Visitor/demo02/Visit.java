package Visitor.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/10/25
 */
public interface Visit {

  void visit(Food food);

  void visit(Electronics electronics);
}
