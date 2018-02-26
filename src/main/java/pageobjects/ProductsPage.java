package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//h2[@data-attribute='Head First Java, 2nd Edition']")
	private WebElement headFirstJava;
	
//	@FindBy(xpath = "//h2[@data-attribute='Head First Python: A Brain-Friendly Guide']")
//	private WebElement headFirstPython;

	
	public ProductsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnHeadFirstJava(){
		headFirstJava.click();
	}
	
//	public void clickOnHeadFirstPython(){
//		headFirstPython.click();
//	}
}
