package Interpreter.demo01;

import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public interface Expression {
  int interpret(Map<String, Integer> context);
}
