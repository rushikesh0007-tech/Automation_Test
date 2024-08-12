package testCases;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC001_LoginTest extends BaseClass  {
	@Test(priority=1)
	public void verify_Login() {
	LoginPage lg= new LoginPage(driver);
     lg.setEmail("devteam@dev-livis.ai");
     lg.setPassword("123@Devs");
     lg.clickLogin();
    
	}
	
	}
