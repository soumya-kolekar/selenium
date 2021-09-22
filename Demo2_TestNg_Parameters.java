package DayOne;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Demo2_TestNg_Parameters {
  @Test(dataProvider = "credentials")
  public void test(String username, String password) {
 System.out.println(username);
 System.out.println(password);}

  @DataProvider(name="credentials")
  public Object[][] cre() {
  Object[][] obj=new Object[3][2];
  obj[0][0]="user1";
  obj[0][1]="user1@123";
  
  obj[1][0]="user2";
  obj[1][1]="user2@123";
  
  obj[2][0]="user3";
  obj[2][1]="user3@123";
  return obj;
  };
  }

