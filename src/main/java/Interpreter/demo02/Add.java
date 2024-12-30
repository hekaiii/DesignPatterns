package Interpreter.demo02;

import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public class Add implements Expression{

  private Expression left, right;

  public Add(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpreter(Map<String, Integer> map) {
    return left.interpreter(map) + right.interpreter(map);
  }
}
