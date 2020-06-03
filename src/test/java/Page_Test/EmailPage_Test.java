package Page_Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.Address_Page;
import Pages.AgeResriction_Page;
import Pages.BusinessUse_Page;
import Pages.Claims_Page;
import Pages.CoverType_Page;
import Pages.DOB_Page;
import Pages.DutyDisclouser_Page;
import Pages.Email_Page;
import Pages.Factory_Page;
import Pages.Finance_Page;
import Pages.FirstName_Page;
import Pages.Gender_Page;
import Pages.Kilometers_Page;
import Pages.Modification_Page;
import Pages.NoClaimDisc_Page;
import Pages.NonStandAccess_Page;
import Pages.OwnAnotherCar_Page;
import Pages.Parking_Page;
import Pages.PolicyStartDate_Page;
import Pages.PricePresentation_Page;
import Pages.Quote_Page;
import Pages.VechRegConfirmation_Page;
import Pages.VechRegLookup_Page;
import Pages.VehicleDamage_Page;
import Pages.YoungestDriver_Page;
import Util.Test_Util;

public class EmailPage_Test extends BaseClass{
	
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
	VehicleDamage_Page vehicledamage_page;
	BusinessUse_Page businessuse_page;
	Kilometers_Page kilometers_page;
	Finance_Page finance_page;
	FirstName_Page firstname_page;
	DOB_Page dob_page;
	Gender_Page gender_page;
	Claims_Page claims_page;
	NoClaimDisc_Page noclaimdisc_Page;
	OwnAnotherCar_Page ownanothercar_page;
	YoungestDriver_Page youngestdriver_page;
	AgeResriction_Page ageresriction_page;
	PolicyStartDate_Page policystartdate_page;
	Email_Page email_page;
	PricePresentation_Page pricepresentation_page;
	
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
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		parking_page= covertype_page.Comphrehensive_Type();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		vehicledamage_page = parking_page.Parking_PlaceAtNight();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		businessuse_page = vehicledamage_page.VehicleDamage();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		kilometers_page = businessuse_page.BusinessUse();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		finance_page = kilometers_page.AvgKms();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		firstname_page = finance_page.LoanEnquiry();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		dob_page = firstname_page.Fisrtname();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		gender_page = dob_page.DOB();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		claims_page = gender_page.gender();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		noclaimdisc_Page = claims_page.claims();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		ownanothercar_page = noclaimdisc_Page.NoClaimsDiscount();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		youngestdriver_page = ownanothercar_page.OwnAnotherCar();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		ageresriction_page = youngestdriver_page.YoungestDriver();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		policystartdate_page = ageresriction_page.AgeResriction();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		email_page = policystartdate_page.PolicyStartDate();
	}
	
	
	@Test
public void CheckAgeRestriction() throws InterruptedException  {
		
		pricepresentation_page = email_page.email();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
