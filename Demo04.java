package DayOne;

import org.testng.annotations.Test;

public class Demo04 {
  @Test
  public void Login() {
	  System.out.println("credentials provided for login ");
  }  @Test(dependsOnMethods= {"Login"})
  public void view() {
	  System.out.println("viewing profile of the user ");
  }  @Test(dependsOnMethods= {"view"})
  public void LogOut() {
	  System.out.println("logout user ");
  }
}
