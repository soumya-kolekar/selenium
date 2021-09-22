package DayOne;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo03 {
	 @Parameters("parameter1name")
  @Test
  public void f1(String parameter1) {
		 System.out.println("value passed"+parameter1);
  }
	 
 @Parameters("parameter2name")
  @Test
  public void f2(String parameter2) {
		 System.out.println("value passed"+parameter2);
  }
 @Parameters("parameter3name")
 @Test
 public void f3(@Optional("this is optional")String parameter3) {
		 System.out.println("value passed"+parameter3);
 }
}
