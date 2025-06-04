package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Properties prop;


	@BeforeClass
	public void intialization() throws IOException {

		// code to read properties file

		FileInputStream file1 = new FileInputStream("C:\\Users\\parul\\eclipse-workspace\\AutomationPractice\\src\\main\\java\\Configuration\\config.properties");
		prop = new Properties();
		prop.load(file1);

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	
	@AfterClass
	public void terminate() {
		driver.quit();
	}}




