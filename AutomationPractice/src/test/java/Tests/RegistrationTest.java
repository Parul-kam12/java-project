package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

	
	
	@Test(priority=0)
	public void ClickOnSignUp() {
		SignUpPage  page = new SignUpPage(driver);
		 page.ClickOnSignUp();
	}
	@Test(priority=1)
	public void testlogin() {
		SignUpPage  page = new SignUpPage(driver);
		page.login(prop.getProperty("name"), prop.getProperty("email"));
		
		Assert.assertTrue(true,"login is sucessful");
}
	
	public void Password(String pssd) {
		RegistrationPage p= new RegistrationPage(driver);
		p.EnterPassword("test123");
	}
	
	 
@Test(priority=2)
public void testUserRegistration() {
	RegistrationPage p= new RegistrationPage(driver); 
   p.fillRegistrationForm(
    		
        //"Mrs",            // gender
        //"Test@123",       // password
        "Parul",            // first name
        "k",                // last name
        "OpenAI",           // company
        "123 Lane",         // address1
        "Suite 456",        // address2
        "India",            // country
        "Punjab",           // state
        "Mohali",           // city
        "160062",           // zipcode
        "9876543210"        // mobile number
    );
}

@Test(priority=3)
public void clickSubmit() {
	RegistrationPage p= new RegistrationPage(driver); 
	p.createAccount();
	
}}










