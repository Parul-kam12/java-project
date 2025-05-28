package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	 @FindBy(id = "id_gender1")
	    WebElement genderMr;

	    @FindBy(id ="id_gender2")
	    WebElement genderMrs;

	    @FindBy(id ="password")
	    WebElement passwordInput;

	    /*@FindBy(id ="days")
	    WebElement daysDropdown;

	    @FindBy(id ="months")
	    WebElement monthsDropdown;

	    @FindBy(id = "years")
	    WebElement yearsDropdown;*/

	    @FindBy(id = "newsletter")
	    WebElement newsletterCheckbox;

	    @FindBy(id = "optin")
	    WebElement offersCheckbox;

	    @FindBy(id = "first_name")
	    WebElement firstNameInput;

	    @FindBy(id = "last_name")
	    WebElement lastNameInput;

	    @FindBy(id = "company")
	    WebElement companyInput;

	    @FindBy(id = "address1")
	    WebElement address1Input;

	    @FindBy(id = "address2")
	    WebElement address2Input;

	    @FindBy(id = "country")
	    WebElement countryDropdown;

	    @FindBy(id = "state")
	    WebElement stateInput;

	    @FindBy(id = "city")
	    WebElement cityInput;

	    @FindBy(id = "zipcode")
	    WebElement zipcodeInput;

	    @FindBy(id = "mobile_number")
	    WebElement mobileInput;

	    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
	    WebElement createAccountBtn;

	   public void selectGender(String gender) {
	    	
	            genderMrs.click();
	    	}
	    
	    public void EnterPassword(String pwd) {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	    	passwordInput.sendKeys("yourPassword");

	    }
	        
	    

	    public void fillRegistrationForm( String fName, String lName,
	                                     String comp, String add1, String add2, String country,
	                                     String state, String city, String zip, String mobile) {

	      

	      /*  new Select(daysDropdown).selectByValue("1");
	        new Select(monthsDropdown).selectByValue("1");
	        new Select(yearsDropdown).selectByValue("1990");*/

	       if(!newsletterCheckbox.isSelected())
	            newsletterCheckbox.click();

	        if(!offersCheckbox.isSelected())
	            offersCheckbox.click();

	        firstNameInput.sendKeys(fName);
	        lastNameInput.sendKeys(lName);
	        companyInput.sendKeys(comp);
	        address1Input.sendKeys(add1);
	        address2Input.sendKeys(add2);

	        new Select(countryDropdown).selectByVisibleText(country);

	        stateInput.sendKeys(state);
	        cityInput.sendKeys(city);
	        zipcodeInput.sendKeys(zip);
	        mobileInput.sendKeys(mobile);
	    }

	    public void createAccount() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	WebElement createAccountBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Create Account')]")));
	    	createAccountBtn.click();
	    }
	}

