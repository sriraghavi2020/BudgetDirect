package Page_Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.DutyDisclouser_Page;
import Pages.Quote_Page;
//import Util.Test_Util;

public class QuotePage_Test extends BaseClass{
	Quote_Page quotepage;
	DutyDisclouser_Page dutydisclouser_page;
	
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		quotepage = new Quote_Page();
		
	}
	
	@Test
public void CheckClickOnGetQuote() throws InterruptedException {
		dutydisclouser_page = quotepage.clickOnGetQuote_Car();
		//driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
