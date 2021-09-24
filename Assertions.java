package SeleniumBasics;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Assertions {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOUMYA\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	//	driver.manage().window().maximize();
		//Declare an implicit wait which is bounded to WebDriver instance
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		WebElement m=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button/span"));
		Thread.sleep(5000);
	//	WebElement n=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[3]/a/label/input"));
	//	Thread.sleep(5000);
	
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(m).click().build().perform();
		
		Thread.sleep(5000);

		driver.findElement(By.className("multiselect-container dropdown-menu"));
		Thread.sleep(5000);
		//	driver.findElement(By.className("checkbox"));
	//	Thread.sleep(5000);
	//	WebElement n=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[3]/a/label/input"));
	//		Thread.sleep(5000);
	//	Select s=new Select(m);
	//	Thread.sleep(5000);
	//	s.selectByValue("Bootstrap");
	//	Thread.sleep(5000);
		
	}

}
