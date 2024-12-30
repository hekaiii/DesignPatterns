package Observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/10
 */
public class WeatherTheme implements Theme {

  List<Observer> obs = new ArrayList<>();


  @Override
  public void addObs(Observer observer) {
    obs.add(observer);
  }

  @Override
  public void removeObs(Observer observer) {
    obs.remove(observer);
  }

  @Override
  public void notifyObs(String message) {
    for (Observer ob : obs) {
      ob.update(message);
    }
  }
}
