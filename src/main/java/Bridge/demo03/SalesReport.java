package Bridge.demo03;

/**
 * @Author: hek32
 * @Description:
 * @Date: 2024/9/18
 */
public class SalesReport extends report {


  public SalesReport(reportFormat format) {
    super(format);
  }

  @Override
  public void generate() {
    format.export();
    System.out.println("salesreport generate");
  }
}
