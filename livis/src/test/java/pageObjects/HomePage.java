package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	 @FindBy(xpath="//button[normalize-space()='Add Station']") WebElement btnAddStation;
 
	 @FindBy(xpath="(//button[@type='button'][normalize-space()='Use Cases'])[1]") WebElement btnUseCase;
	 
	 public void clickOnAddStation() {
		 btnAddStation.click();
		 
	 }
	 public void clickonUseCaseButton() {
		 btnUseCase.click();
	 }
	 
}
