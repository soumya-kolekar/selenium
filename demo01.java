package DayTwo;
import org.testng.Assert;
//assertions are validation or checkpoints
//hard assert and soft assert
import org.testng.annotations.Test;

public class demo01 {
	String assertstring="welcome";//hello 
  @Test
  public void test() {
	  Assert.assertEquals("welcome", assertstring);
	  System.out.println("assertion executed");
	  Assert.assertTrue(assertstring.equals("welcome"));
	  System.out.println("assertion true got executed");
	  
  }
}
