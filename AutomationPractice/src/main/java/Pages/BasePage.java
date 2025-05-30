package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;

	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);

		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  }
		
		
		}

	


	


