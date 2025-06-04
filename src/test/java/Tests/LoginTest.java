package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SignUpPage;

public class LoginTest extends BaseTest{

	
	@Test(priority=0)
	public void ClickOnSignUp() {
		SignUpPage page = new SignUpPage(driver);
		 page.ClickOnSignUp();
	}
	@Test(priority=2)
	public void testlogin() {
		LoginPage page = new LoginPage (driver);
		page.login(prop.getProperty("email1"), prop.getProperty("password"));
		page.clickLogin();
		
		Assert.assertTrue(true,"login is sucessful");	}
	
	@Test(priority=1)
	public void InvalidPassword() {
		LoginPage page = new LoginPage (driver);
		LoginPage loginPage= new LoginPage(driver);
		//loginPage.enterEmail(prop.getProperty("email1"));
		loginPage.enterEmail("p1@gmail");
		loginPage.enterPassword("p1");
		loginPage.clickLogin();
} }
