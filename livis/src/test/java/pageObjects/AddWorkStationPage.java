package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWorkStationPage extends BasePage{

	public AddWorkStationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input [@name='workstation_name']") WebElement txtWorkStationName;
	@FindBy(xpath="//input[@id='workstation_plant_name']") WebElement txtWSPlantName;
	@FindBy(xpath="//input[@id='workstation_location']") WebElement txtWSLocationname;
	@FindBy(xpath="(//div[contains(@class,' livis-stepper-button-grid ')])[2]") WebElement btnNext;
	@FindBy(xpath="//img[@alt='static-station-image']") WebElement imgStaticStation;
	
	

	
	public void setWorkStationName(String sname) {
		txtWorkStationName.sendKeys(sname);
		
	}
	
	public void  setWSPlantName(String pltname) {
		txtWSPlantName.sendKeys(pltname);
	}
  
	public void setWSLocationName(String locName) {
		txtWSLocationname.sendKeys(locName);
	}
	
	public void clickOnNextButton() {
		btnNext.click();
	}
	
	
}
