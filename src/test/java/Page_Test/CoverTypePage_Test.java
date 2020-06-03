package Page_Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.Address_Page;
import Pages.CoverType_Page;
import Pages.DutyDisclouser_Page;
import Pages.Factory_Page;
import Pages.Modification_Page;
import Pages.NonStandAccess_Page;
import Pages.Parking_Page;
import Pages.Quote_Page;
import Pages.VechRegConfirmation_Page;
import Pages.VechRegLookup_Page;
import Util.Test_Util;

public class CoverTypePage_Test extends BaseClass{
	Quote_Page quotepage;
	DutyDisclouser_Page dutydisclouser_page;
	Address_Page address_page; 
	VechRegLookup_Page vechreglookup_page;
	VechRegConfirmation_Page vechregconfirmation_page;
	Factory_Page factory_page;
	NonStandAccess_Page nonstandaccess_page;
	Modification_Page modification_page;
	CoverType_Page covertype_page;
	Parking_Page parking_page; 

	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		quotepage = new Quote_Page();
		dutydisclouser_page = quotepage.clickOnGetQuote_Car();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		address_page = dutydisclouser_page.ClickOnAgree();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		vechreglookup_page = address_page.AddressDetails();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		vechregconfirmation_page = vechreglookup_page.VechRegDetails();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		factory_page = vechregconfirmation_page.VechRegConfirmation();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		nonstandaccess_page = factory_page.NoFactoryOpt();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		modification_page = nonstandaccess_page.AccessoriesOpt();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		covertype_page = modification_page.Modifications();
	}
	
	
	@Test
public void CheckCoverType() throws InterruptedException  {
		
		parking_page = covertype_page.Comphrehensive_Type();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
