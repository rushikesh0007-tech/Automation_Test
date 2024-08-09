package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPartPage extends BasePage {

	public AddPartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[normalize-space()='Create a Part']") WebElement btnCreateaPart;
	@FindBy(xpath="//input[@name='part_name']") WebElement txtPartName;
	@FindBy(xpath="//input[@id='part_number']") WebElement txtpartnumber;
	@FindBy(xpath="//input[@id='part_description']") WebElement txtPartDiscription;
	@FindBy(xpath="//div[contains(@class,' livis-stepper-button-grid css-1sv3fxx')]") WebElement btnNext;
	@FindBy(xpath="//div[@class='livis-create-part-without-edge-btn']//button[@id='livis-button-id']") WebElement btnWithoutEdge;
	@FindBy(xpath="//button[normalize-space()='Create']") WebElement btnCreate;
	@FindBy(xpath="//span[normalize-space()='Click to upload']") WebElement btnClickonUploadimage;
	
	
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
	
	public void clickOnWithoutEdgeButton() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(btnWithoutEdge));
		    clickableElement.click();
	
	}
	public void clickoncreateButton() {
		btnCreate.click();
	}

	public void clickOnUploadImage() {
		btnClickonUploadimage.click();
	}
	public void clickOnUploadImagetesting() {
		btnClickonUploadimage.click();
	}
}
