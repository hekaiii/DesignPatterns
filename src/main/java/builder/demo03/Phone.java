package builder.demo03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/12
 */
public class Phone {

  private String cpu;
  private String screen;
  private String memory;
  private String mainBoard;

  private Phone(Build build) {
    this.cpu = build.cpu;
    this.screen = build.screen;
    this.memory = build.memory;
    this.mainBoard = build.mainBoard;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "cpu='" + cpu + '\'' +
        ", screen='" + screen + '\'' +
        ", memory='" + memory + '\'' +
        ", mainBoard='" + mainBoard + '\'' +
        '}';
  }

  public static final class Build {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public Build cpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Build screen(String screen) {
      this.screen = screen;
      return this;
    }
    public Build memory(String memory) {
      this.memory = memory;
      return this;
    }
    public Build mainBoard(String mainBoard) {
      this.mainBoard = mainBoard;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }

  }
}
