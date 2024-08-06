package testCases;

import org.testng.annotations.Test;

import pageObjects.AddWorkStationPage;
import pageObjects.HomePage;

public class TC002_AddWorkstationTest extends TC001_LoginTest{
	@Test(priority=3)
	public void verify_addWorkStation() {
		
		HomePage hp= new HomePage(driver);
		hp.clickOnAddStation();
		
		AddWorkStationPage ws= new AddWorkStationPage(driver);
		ws.setWorkStationName("statonA");
		ws.setWSPlantName("PlantB");
		ws.setWSLocationName("India");
		ws.clickOnNextButton();
	}

}
