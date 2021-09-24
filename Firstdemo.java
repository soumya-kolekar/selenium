package SeleniumBasics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstdemo {
	WebDriver driver;
	@Test
	public void test() {
		//System.s(webdriver.ie.driver,path)
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe")	;
//creating webdriver instance
driver=new ChromeDriver();
//navigate to webpage
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//maximizing
driver.manage().window().maximize();
//retriving
String title=driver.getTitle();
System.out.println(title);
//closing driver
driver.close();
driver.quit();
	}

}
