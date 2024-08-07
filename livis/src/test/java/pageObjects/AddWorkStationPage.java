package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddWorkStationPage extends BasePage{

	public AddWorkStationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input [@name='workstation_name']") WebElement txtWorkStationName;
	@FindBy(xpath="//input[@id='workstation_plant_name']") WebElement txtWSPlantName;
	@FindBy(xpath="//input[@id='workstation_location']") WebElement txtWSLocationname;
	@FindBy(xpath="(//div[contains(@class,' livis-stepper-button-grid ')])[2]") WebElement btnNext;
	@FindBy(xpath="//img[@alt='static-station-image']") WebElement imgStaticStation;
	@FindBy(xpath="(//input[@name='camera.0.camera_name'])[1]") WebElement txtCameraName;
	@FindBy(id="camera.0.camera_type-id")   WebElement dropdownContainer;;
	@FindBy(xpath="//ul[@role='listbox']//li[@role='option']") List<WebElement> dropdownOptions;
	@FindBy(xpath="//input[@name='camera.0.camera_address']") WebElement cameraIpField;
	@FindBy(xpath="//input[contains(@name,'camera.0.camera_address')]") WebElement  submitButton;
	@FindBy(xpath="(//button[@id='livis-button-id'])[2]") WebElement btnCreate;
    
	
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
	
	public void clickonImgStaticStation() {
		imgStaticStation.click();
	}
	
	public void setCameraName(String cname) {
		txtCameraName.sendKeys(cname);		
	}
	
	 public void openDropdown() {
	        dropdownContainer.click();
	    }
	
	 public void selectDropdownOptionByVisibleText(String visibleText) {
	        openDropdown();
	        for (WebElement option : dropdownOptions) {
	            if (option.getText().equals(visibleText)) {
	                option.click();
	                break;
	            }
	        }
	    }
	 public void clickSubmit() {
	        submitButton.click();
	    }
		
	 public void enterCameraIp(String ipAddress) {
		    clickSubmit();
	        cameraIpField.clear();
	        cameraIpField.sendKeys(ipAddress);
	    } 
	 	
	 public void clickOnCreateButton() {
		 btnCreate.click();
	 }
}
