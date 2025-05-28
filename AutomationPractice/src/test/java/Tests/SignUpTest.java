package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SignUpPage;

public class SignUpTest extends BaseTest {
	
	
	
	@Test(priority=0)
	public void ClickOnSignUp() {
		SignUpPage page = new SignUpPage(driver);
		 page.ClickOnSignUp();
	}
	@Test(priority=1)
	public void testlogin() {
		SignUpPage page = new SignUpPage(driver);
		page.login(prop.getProperty("name"), prop.getProperty("email"));
		
		Assert.assertTrue(true,"login is sucessful");	}

}

