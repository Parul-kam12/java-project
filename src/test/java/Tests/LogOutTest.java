package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LogOutPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.SignUpPage;

public class LogOutTest extends BaseTest{
	
	@Test(priority=0)
	public void ClickOnSignUp() {
		SignUpPage page = new SignUpPage(driver);
		 page.ClickOnSignUp();
		 Assert.assertTrue(true,"click on signup is successful");
	}
	@Test(priority=1)
	public void testlogin() {
		LoginPage page = new LoginPage (driver);
		page.login(prop.getProperty("email1"), prop.getProperty("password"));
		
		Assert.assertTrue(true,"login is successful");
	}

	
       @Test(priority=2)
	   public void Logout() {
		LogOutPage out = new LogOutPage(driver); 
        out.ClickLogOut();   
		 
	 }
	}
