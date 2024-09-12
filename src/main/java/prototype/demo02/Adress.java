package prototype.demo02;

import java.io.Serializable;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/10
 */
public class Adress implements Serializable {

  private String city;
  private String street;


  public Adress(String city, String street) {
    this.city = city;
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public String toString() {
    return "Adress{" +
        "city='" + city + '\'' +
        ", street='" + street + '\'' +
        '}';
  }
}
