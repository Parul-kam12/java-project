package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Signup / Login')]") 
	WebElement ClickOnSignUp;
	
	@FindBy(xpath= "//input[@data-qa='signup-name']") 
	WebElement EnterName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement EnterEmail;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement ClickSignUp;
	
	public void ClickOnSignUp() 
	{
		ClickOnSignUp.click();
	}
	
	
	public void enterName(String name) 
	{
		EnterName.sendKeys(name);
	}

	public void enterEmail(String email) 
	{
		EnterEmail.sendKeys(email);
	}

	
	public void clickSignIn()
	{
		ClickOnSignUp.click();
	}
	
	public void login(String email,String pssd) {
		enterName(email);
		enterEmail(pssd);
		clickSignIn();
	}

}



