package testCases;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.AddPartPage;
import pageObjects.AddUseCasePage;
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
	@Test(priority=3)
	public void verify_addUseCase() {
		HomePage hp1= new HomePage(driver);
		hp1.clickonUseCaseButton();
		AddUseCasePage uc=new AddUseCasePage(driver);
		uc.clickOnAddUseCaseButton();
		uc.setUserCaseName("tablet");
		uc.setUseCaseDiscription("usecase discription");
		uc.setClientName("lupin");
		uc.setClientLocation("india");
		uc.clickOnclNextButton();
		uc.clickOnImage();
		uc.clickNext();
		uc.clickOnMaterialimage();
		uc.clickNext();
		uc.clickOnCatogoryImage();
		uc.clickNext();
		uc.clickonChoosePartimage();
		uc.clickNext();
		uc.clickoncreatedprocessimage();
		uc.clickNext();
		//uc.setFieldFeatures("tablet_frame");
		uc.clickonExistancefeature();
		uc.clickNext();
		uc.clickOnCreateButton();
		uc.clickOnPartButton();
		AddPartPage apart= new AddPartPage(driver);
		apart.clickonCreatepartButton();
		apart.setPartName("dolo");
		apart.setPartNumber("500");
		apart.setPartDiscription("this is tablet discription");
		apart.clickOnNext();
		apart.clickOnWithoutEdgeButton();
		apart.clickoncreateButton();
		apart.clickOnNext();
		apart.clickOnUploadImage();
	}
	/*
	 * @Test public void verify_Parts() { HomePage hp1= new HomePage(driver);
	 * hp1.clickonUseCaseButton(); AddPartPage apart= new AddPartPage(driver);
	 * apart.clickonCreatepartButton(); }
	 */
	
	
	public String randomStrings() {
	String generatedString=	RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

}
