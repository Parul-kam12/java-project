package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement firstProductAddBtn;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    WebElement secondProductAddBtn;

    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    WebElement continueShoppingBtn;

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement viewCartLink;
    
    public void clickProducts() {
        productsLink.click();
    }
    
    public void addFirstProduct() {
    	
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	wait.until(ExpectedConditions.elementToBeClickable(firstProductAddBtn));
        j.executeScript("arguments[0].scrollIntoView(true);", firstProductAddBtn); // scrolls the page so that the firstProductAddBtn element is visible on the screen.
        firstProductAddBtn.click();
        //driver.switchTo().defaultContent(); 
    }

    public void addSecondProduct() {
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	wait.until(ExpectedConditions.elementToBeClickable(secondProductAddBtn));
        j.executeScript("arguments[0].scrollIntoView(true);", secondProductAddBtn);
        j.executeScript("arguments[0].click();", secondProductAddBtn);
    }
    

    public void clickContinueShopping() {
    	JavascriptExecutor j = (JavascriptExecutor)driver;
    	wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn));
        // Use JS click in case normal click not working due to modal issues
        j.executeScript("arguments[0].click();", continueShoppingBtn);
    }
    

    public void clickViewCart() {
        viewCartLink.click();
    }

}
