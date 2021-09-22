package DayOne;

import org.testng.annotations.Test;

public class Demo06 {
  @Test(groups= {"Holi","Divali"})
  public void f1() {
	  System.out.println("festival1");
  }
  @Test(groups= {"Holi","Dussera"})
  public void f2() {
	  System.out.println("festival2");
  }
  @Test(groups= {"Holi"})
  public void f3() {
	  System.out.println("festival3");
  }
}
