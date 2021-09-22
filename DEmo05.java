package DayOne;

import org.testng.annotations.Test;

public class DEmo05 {
  @Test(priority=2)//if same priority==>execute sequentially
  public void test1() {
	  System.out.println("print1");
  }
  @Test(priority=0)
  public void test2() {
	  System.out.println("print2");
  }
  @Test(priority=1)
  public void test3() {
	  System.out.println("print3");
  } @Test(priority=4,enabled=false)
	  public void test4() {
		  System.out.println("print3");  
  }
}
