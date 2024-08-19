package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUseCasePage extends BasePage{

	public AddUseCasePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[normalize-space()='Add Use Case']")  WebElement btnAddUseCase;
	@FindBy(xpath="//input[@name='usecase_name']") WebElement txtUserCaseName;
	@FindBy(xpath="//textarea[@id='usecase_desc']") WebElement txtDiscription;
    @FindBy(xpath="//input[@id='usecase_client_name']") WebElement txtClientname;
    @FindBy(xpath="//input[@id='usecase_client_location']") WebElement txtClientNameLOcation;
	@FindBy(xpath="//button[@id='livis-button-id']") WebElement btnUsecaseNext;
	@FindBy(xpath="//span[text()='electronics']") WebElement ImgSelect;
	@FindBy(xpath="(//button[normalize-space()='Next'])[1]") WebElement btnNext;
	@FindBy(xpath="//span[text()='glass']") WebElement imgSelectMaterial;
	@FindBy(xpath="//span[text()='iphone']") WebElement imgSelectCatagory;
	@FindBy(xpath="//span[text()='iphone15']")WebElement ImgSelectChosePartimage;
	@FindBy(xpath="//span[text()='packaging']") WebElement imgSelectCreatedProcessimage;
	@FindBy(xpath="//div[contains(@class,'input-field-features css-1u0h3mu')]") WebElement txtInputfieldFeatures;
	@FindBy(xpath="//button[normalize-space()='tablet_frame']") WebElement btnFeatures;
    @FindBy(xpath="(//button[@id='livis-button-id'])[2]") WebElement btnCreate;
	@FindBy(xpath="//button[normalize-space()='Parts']") WebElement btnParts;
    
    
    public void clickOnAddUseCaseButton() {
		btnAddUseCase.click();
	}
	
	public void setUserCaseName(String UCname) {
		txtUserCaseName.sendKeys(UCname);		
	}
	
	public void setUseCaseDiscription(String discp) {
		txtDiscription.sendKeys(discp);		
	}
	
	public void setClientName(String cname) {
		txtClientname.sendKeys(cname);		
	}
	public void setClientLocation(String cloc) {
		txtClientNameLOcation.sendKeys(cloc);
	}
	public void clickOnclNextButton() {
		btnUsecaseNext.click();
	}
	
	public void clickOnImage() {
		ImgSelect.click();
	}
	public void clickNext() {
		btnNext.click();
	}
	
	public void clickOnMaterialimage() {
		imgSelectMaterial.click();
	}
	public void clickOnCatogoryImage() {
		imgSelectCatagory.click();
	}
	
	public void clickonChoosePartimage() {
		ImgSelectChosePartimage.click();
	}
	public void clickoncreatedprocessimage() {
		imgSelectCreatedProcessimage.click();
	}
	
	public void setFieldFeatures(String sfeature) {
		txtInputfieldFeatures.sendKeys(sfeature);
	}
	public void clickonExistancefeature() {
		btnFeatures.click();
	}
	public void clickOnCreateButton() {
		btnCreate.click();
	}
	
	public void clickOnPartButton() {
		btnParts.click();
	}
}
