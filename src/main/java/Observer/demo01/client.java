package Observer.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/10
 */
public class client {

  public static void main(String[] args) {
    WeatherTheme weatherTheme = new WeatherTheme();

    weatherTheme.addObs(new ConcreteObs("test1"));
    weatherTheme.addObs(new ConcreteObs("test2"));
    weatherTheme.addObs(new ConcreteObs("test3"));
    weatherTheme.addObs(new ConcreteObs("test4"));

    weatherTheme.notifyObs("message");
  }

}
