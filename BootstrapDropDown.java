package SeleniumBasics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropDown {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
WebElement first=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button/span"));
	first.click();
	WebElement Two=driver.findElement(By.className("caret"));
	Two.click();
	driver.findElement(By.className("multiselect-container dropdown-menu")).click();
//driver.findElement(By.className("checkbox")).click();
//	Select type=new Select(Two);
//		Thread.sleep(5000);
//	type.selectByValue("Bootstrap");
	
	}

}
