package test1.sdsf;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;		
	@Test		
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
					 
		
		//mngr268703
		//AdUgyhy
	}	
	//@Test(enabled=false)
	@Test
	public void t() {
		String title = driver.getTitle();	
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
	}
	@BeforeTest
	public void beforeTest() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
