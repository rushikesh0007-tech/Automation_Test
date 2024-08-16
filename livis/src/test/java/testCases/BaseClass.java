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
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
        options.addArguments("--remote-allow-origins=*"); // Allow all origins for remote access
        options.addArguments("--window-size=1920x1080"); // Set screen size to avoid issues

        driver = new ChromeDriver(options);

		// driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.livis.ai/auth/login");
		 driver.manage().window().maximize();
		
	}

	
	/*
	 * @AfterClass public void teardown() { driver.quit(); }
	 */
	

}
