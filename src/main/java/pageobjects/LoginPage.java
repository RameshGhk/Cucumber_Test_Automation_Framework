package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import managers.FileReaderManager;

public class LoginPage {
	
	WebElement element;
	WebDriver driver;
	
	@FindBy(id = "ap_email")
	private WebElement enterEmail;
	
	@FindBy(id = "continue")
	private WebElement clickOnContinue;
	
	@FindBy(id = "ap_password")
	private WebElement enterPassword;
	
	@FindBy(id = "signInSubmit")
	private WebElement signIn;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void enterEmail(){
		enterEmail.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginEmail());
	}
	
	private void clickOnContinue(){
		clickOnContinue.click();
	}
	
	private void enterPassword(){
		enterPassword.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginPassword());
	}
	
	private void clickOnSignIn(){
		signIn.click();
	}
	
	public void loginToCheckOut(){
		enterEmail();
		clickOnContinue();
		enterPassword();
		clickOnSignIn();
		
	}

}
