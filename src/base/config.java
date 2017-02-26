package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.WebDriverFunction;

public class config extends WebDriverFunction {
	public WebDriver driver;	
	@BeforeMethod
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashraf\\workspace\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.spafinder.com");
	implicWait();
	}
	//@AfterMethod()
	//public void connClose(){
		 //driver.close();
		 //driver.quit();
}
