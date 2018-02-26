package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	WebDriver driver;
	
	@FindBy(id = "nav-cart-count")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//input[@value='Proceed to checkout']")
	private WebElement proceedCheckPOut;
	
	public CheckOutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSoppingCart(){
		shoppingCart.click();
	}
	
	public void clicksOnProceedCheckPOut(){
		proceedCheckPOut.click();
	}

}
