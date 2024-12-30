package Interpreter.demo02;

import java.util.HashMap;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/4/14
 */
public class client {

  public static void main(String[] args) {
    Expression expression = new Substract(new Add(new Variable("a"), new Variable("b")),
        new Variable("c"));
    HashMap<String, Integer> map = new HashMap<>();
    map.put("a", 5);
    map.put("b", 5);
    map.put("c", 2);
    System.out.println(expression.interpreter(map));
  }

}
