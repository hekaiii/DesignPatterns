package Observer.demo01;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2025/3/10
 */
public interface Theme {
  void addObs(Observer observer);
  void removeObs(Observer observer);
  void notifyObs(String message);
}
