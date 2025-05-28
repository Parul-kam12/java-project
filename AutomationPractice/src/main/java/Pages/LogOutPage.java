package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPage extends BasePage {

	public LogOutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement LogOut;


    public void ClickLogOut() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(LogOut));
	    LogOut.click();
	
}
}
