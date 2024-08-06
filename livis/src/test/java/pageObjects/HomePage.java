package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	 @FindBy(xpath="(//button[@type='button'][normalize-space()='Add Station'])[2]") WebElement btnAddStation;
 
	 
	 public void clickOnAddStation() {
		 btnAddStation.click();
	 }
}
