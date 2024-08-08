package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPartPage extends BasePage {

	public AddPartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Create a Part']") WebElement btnCreateaPart;
	@FindBy(xpath="//input[@name='part_name']") WebElement txtPartName;
	@FindBy(xpath="//input[@id='part_number']") WebElement txtpartnumber;
	@FindBy(xpath="//input[@id='part_description']") WebElement txtPartDiscription;
	@FindBy(xpath="//div[contains(@class,' livis-stepper-button-grid css-1sv3fxx')]") WebElement btnNext;
	
	public void clickonCreatepartButton() {
		btnCreateaPart.click();
	}
    
	public void setPartName(String pname) {
		txtPartName.sendKeys(pname);
	}
	
	public void setPartNumber(String pnumber) {
		txtpartnumber.sendKeys(pnumber);
	}
	public void setPartDiscription(String desparts) {
		txtPartDiscription.sendKeys(desparts);
	}
	
	public void clickOnNext() {
		btnNext.click();
	}
	
}
