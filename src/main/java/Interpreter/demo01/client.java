package Interpreter.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public class client {
  public static void main(String[] args) {
    // 表达式 a + b - c
    Expression expr = new Subtract(
        new Add(new Variable("a"), new Variable("b")),
        new Variable("c")
    );

    Map<String, Integer> context = new HashMap<>();
    context.put("a", 5);
    context.put("b", 3);
    context.put("c", 2);

    System.out.println(expr.interpret(context)); // 输出 6
  }
}
