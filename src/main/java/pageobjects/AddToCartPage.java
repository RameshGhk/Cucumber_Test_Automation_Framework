package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	WebDriver driver;
	

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCart;
	

	public AddToCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addTocart(){
		addToCart.click();
	}
}
