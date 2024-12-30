package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public class client {

  public static void main(String[] args) {
    Support alice = new NoSupport("alice");
    Support bob = new LimitSupport("bob", 100);
    Support charlie = new SpecialSupprt("charlie", 429);
    Support diana = new LimitSupport("diana", 200);
    Support ella = new OldSupport("ella");
    Support fred = new LimitSupport("fred", 300);

    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(ella).setNext(fred);
    for (int i = 0; i < 500; i += 33) {
      alice.support(new Trouble(i));

    }
  }
}
