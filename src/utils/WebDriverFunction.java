package utils;




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverFunction{


	public WebDriver driver;

	// ==========================================type==========================================

	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);

	}

	// ==========================================Click==========================================

	public void  clickByXpath (String locator){
		driver.findElement(By.xpath(locator)).click();
	}

	// ===========================================wait===========================================
	public void implicWait (){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void explicitWait (int x, String locator){
		WebDriverWait wait = new WebDriverWait (driver, x);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
}
