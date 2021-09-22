package DayOne;

import org.testng.annotations.Test;

public class NewTest {
	@Test(enabled=true)
	  public void signin() {
		  System.out.println("Sign In");
	  }

@Test(priority=7)
	  public void signOut() {
		  System.out.println("Sign Out");
	  }
@Test(dependsOnMethods="signOut")
	  public void homePage() {
		  System.out.println("Home Page verified");
	  }
}
