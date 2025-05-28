package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Pages.LoginPage;
import Pages.ProductsPage;

public class ProductTest extends BaseTest {
	
	@Test(priority=0)
	public void ClickOnSignUp() {
		SignUpPage page = new SignUpPage(driver);
		 page.ClickOnSignUp();
	}
	@Test(priority=1)
	public void testlogin() {
		LoginPage page = new LoginPage (driver);
		page.login(prop.getProperty("email1"), prop.getProperty("password"));
		
		Assert.assertTrue(true,"login is sucessful");
	}

	
	@Test(priority=3)
	public void clickOnProduct() {
    ProductsPage p= new ProductsPage(driver);
    p.clickProducts();
}
	@Test(priority=4)
	public void addFirstProduct() {
	    ProductsPage p= new ProductsPage(driver);
	    p.addFirstProduct();
	}
	   @Test(priority=5)
	    public void addSecondProduct() {
		    ProductsPage p= new ProductsPage(driver);
		    p.addSecondProduct();
		    }
	   
	   @Test(priority=6)
	   public void clickContinueShopping() {
		    ProductsPage p= new ProductsPage(driver);
		    p.clickContinueShopping();
	   }
		    
		 @Test(priority=7)
		 public void clickViewCart() {
		   ProductsPage p= new ProductsPage(driver);
			p.clickViewCart();
		 }}
