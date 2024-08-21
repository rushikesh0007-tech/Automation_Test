package pageObjects;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
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
	@FindBy(xpath="//button[contains(@class,'MuiButton-colorPrimary livis-modal-btn-round livis-modal-cancel-contained-btn css-1hw9j7s')]") WebElement btnCreate;
	//@FindBy(xpath="//button[normalize-space()='Create']") WebElement btnCreate;
	@FindBy(xpath="//span[normalize-space()='Click to upload']") WebElement btnClickonUploadimage;
	@FindBy(xpath="//input[@id='upload-input']") WebElement fieldInput;
	@FindBy(xpath="//input[@aria-label='controlled']") WebElement checkboxFeatureSelect;
	@FindBy(xpath="(//button[normalize-space()='Submit'])[1]") WebElement btnSubmit;
	
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
		 try {
		    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(btnWithoutEdge));
		    clickableElement.click();		    
         } catch (StaleElementReferenceException e) {
        	 
         }
	
	}
	public void clickoncreateButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WebElement clickoncreate = wait.until(ExpectedConditions.elementToBeClickable(btnCreate));
		clickoncreate.click();
		} catch (ElementClickInterceptedException e) {
			
		}
	}

	public void clickOnUploadImage() {
		btnClickonUploadimage.click();
	}
	
	public void uploadImage(String imageupload) {		
		fieldInput.sendKeys(imageupload);
	}
	
	public void selectCheckbox() {
        if (!checkboxFeatureSelect.isSelected()) {
            checkboxFeatureSelect.click();
        }
    }
	
	public void clickonSubmitButton() {
		btnSubmit.submit();
	}
}
