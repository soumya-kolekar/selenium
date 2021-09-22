package DayTwo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//soft assert
public class Demo08 {
	String aseeretionstring="welcome";
  @Test
  public void f() {
		SoftAssert obj=new SoftAssert();
		obj.assertEquals("hello", aseeretionstring);
		obj.assertTrue(aseeretionstring.equals("welcome"));
		obj.assertAll();
  }
}
