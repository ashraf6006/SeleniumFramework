package All_Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.config;
import values.searchValues;
import locators.searchLocators;



public class Test_1 extends config {
	searchValues sv = new searchValues();
	searchLocators sl = new searchLocators();

	@Test
	public void Test1(){

		typeByXpath(sl.iWantSearchLocator,sv.iWantSearchValues);
		typeByXpath(sl.iWantSearchZipcode,sv.iWantZipcode);
		clickByXpath(sl.iWantSearchButton);

		//@Test
		//public void Test(){
		//driver.get("http://www.facebook.com");
		//typeByXpath(sl.iWantEmail,sv.iWantEmail);
		//typeByXpath(sl.iWantPassword, sv.iWantPassword);
		//clickByXpath(sl.iWantLogin);

	}


}
