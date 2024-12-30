package Interpreter.demo01;

import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public class Add implements Expression {
  private Expression left, right;
  public Add(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }
  public int interpret(Map<String, Integer> context) {
    return left.interpret(context) + right.interpret(context);
  }
}
