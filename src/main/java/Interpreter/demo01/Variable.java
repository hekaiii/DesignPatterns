package Interpreter.demo01;

import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public class Variable implements Expression {
  private String name;
  public Variable(String name) {
    this.name = name;
  }
  public int interpret(Map<String, Integer> context) {
    return context.get(name);
  }
}
