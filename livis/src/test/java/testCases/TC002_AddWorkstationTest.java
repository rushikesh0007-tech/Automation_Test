package testCases;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pageObjects.AddWorkStationPage;
import pageObjects.HomePage;

public class TC002_AddWorkstationTest extends TC001_LoginTest{
	@Test(priority=2)
	public void verify_addWorkStation() {
		
		HomePage hp= new HomePage(driver);
		hp.clickOnAddStation();
		
		AddWorkStationPage ws= new AddWorkStationPage(driver);
		ws.setWorkStationName("statonY");
		ws.setWSPlantName("PlantB");
		ws.setWSLocationName("India");
		ws.clickOnNextButton();
		ws.clickonImgStaticStation();
		ws.clickOnNextButton();
		ws.setCameraName("C1");
		ws.selectDropdownOptionByVisibleText("USB Cam");	    
		ws.enterCameraIp("1");		
		ws.clickOnNextButton();
		ws.clickOnCreateButton();
		
	}
	
	public String randomStrings() {
	String generatedString=	RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

}
