package ChainOfResponsibility.demo02;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/11/5
 */
public abstract class Support {
  private String name;
  private Support next;
  public Support(String name) {
    this.name = name;
  }
  public Support setNext(Support support) {
    this.next = support;
    return next;
  }
  public final void support(Trouble trouble) {
    if (resolve(trouble)) {
      done(trouble);
    } else if (next != null) {
      next.support(trouble);
    } else {
      fail(trouble);
    }
  }
  @Override
  public String toString() {
    return "Support{" +
        "name='" + name + '\'' +
        ", next=" + next +
        '}';
  }

  protected abstract boolean resolve(Trouble trouble);

  protected void done(Trouble trouble) {
    System.out.println(trouble + " is resolved by " + this + ".");
  }

  protected void fail(Trouble trouble) {
    System.out.println(trouble + " cannot be resolved.");
  }
}
