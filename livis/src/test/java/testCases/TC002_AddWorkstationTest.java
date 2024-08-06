package testCases;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pageObjects.AddWorkStationPage;
import pageObjects.HomePage;

public class TC002_AddWorkstationTest extends TC001_LoginTest{
	@Test(priority=2)
	public void verify_addWorkStation() {
		
		HomePage hp= new HomePage(driver);
		hp.clickOnAddStation();
		
		AddWorkStationPage ws= new AddWorkStationPage(driver);
		ws.setWorkStationName("statonA");
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

}
