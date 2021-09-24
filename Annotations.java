package SeleniumBasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations {

	@BeforeClass//tests that are done only once for connnection/opening database
	
	public static void setUpBeforeClass() throws Exception {
		System.out.println("beforeclass");
	}

	@AfterClass//close or release resources that are allocated by BeforeClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterclass");
		}

	@Before//must run once before executing every test used to allocate resources that are needed to ca;ll before methods
	public void setUp() throws Exception {
		System.out.println("before");
		
	}

	@After//to release all resources
	public void tearDown() throws Exception {
		System.out.println("after");
		}

	@Test//method attached to it can run test case
	public void test() {
		System.out.println("test");
		}

}
