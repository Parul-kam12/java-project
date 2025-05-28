package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    WebElement loginLink;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailInput;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPasswordInput;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    public void ClickOnSignUp() 
	{
    	 loginLink.click();
	}
	
	
	public void enterEmail(String email) 
	{
		 loginEmailInput.sendKeys(email);
	}

	public void enterPassword(String pssd) 
	{
		loginPasswordInput.sendKeys(pssd);
	}

	
	public void clickLogin()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
	}
	
	public void login(String email,String pssd) {
		enterEmail(email);
		enterPassword(pssd);
		clickLogin();
	}

}
