package managers;
  
import org.openqa.selenium.WebDriver;
import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;
import pageobjects.AddToCartPage;


public class PageObjectManager {
 
	private WebDriver driver;
 
	private ProductsPage productsPage;
 
	private AddToCartPage addToCartPage;
 
	private HomePage homePage;
 
	private CheckOutPage checkoutPage;
	
	private LoginPage loginPage;

 
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
 
	public HomePage getHomePage(){
 
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
 
	}
 
	
 
	public ProductsPage getProductListingPage() {
 
		return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;
 
	}
 
	
 
	public AddToCartPage getAddToCartPage() {
 
		return (addToCartPage == null) ? addToCartPage = new AddToCartPage(driver) : addToCartPage;
 
	}
 
	
 
	public CheckOutPage getCheckoutPage() {
 
		return (checkoutPage == null) ? checkoutPage = new CheckOutPage(driver) : checkoutPage;
 
	}
	
	public LoginPage getLoginPage() {
		 
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
 
	}
 
	
}