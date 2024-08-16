package testCases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		

		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.livis.ai/auth/login");
		 driver.manage().window().maximize();
		
	}

	
	/*
	 * @AfterClass public void teardown() { driver.quit(); }
	 */
	

}
