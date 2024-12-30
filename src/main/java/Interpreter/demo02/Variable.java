package Interpreter.demo02;

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

  @Override
  public int interpreter(Map<String, Integer> map) {
    return map.get(name);
  }
}
