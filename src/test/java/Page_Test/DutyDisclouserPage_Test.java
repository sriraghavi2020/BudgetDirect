package Page_Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.Address_Page;
import Pages.DutyDisclouser_Page;
import Pages.Quote_Page;
import Util.Test_Util;

public class DutyDisclouserPage_Test extends BaseClass{
	Quote_Page quotepage;
	DutyDisclouser_Page dutydisclouser_page;
	Address_Page Address_Page; 
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		quotepage = new Quote_Page();
		dutydisclouser_page = quotepage.clickOnGetQuote_Car();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@Test
public void CheckClickOnAgree() throws InterruptedException {
		Address_Page = dutydisclouser_page.ClickOnAgree();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
