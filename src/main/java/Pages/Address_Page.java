package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;
import Util.Test_Util;

public class Address_Page extends BaseClass{
	@FindBy(xpath="//input[@id='postcode']")
	WebElement PinCode;
	@FindBy(xpath="//input[@ng-model='$ctrl.address']")
	WebElement Address;
	@FindBy(xpath="//div[contains(text(), 'Next')]")
	WebElement NextBtn;
	public Address_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public VechRegLookup_Page AddressDetails() throws InterruptedException {
		PinCode.sendKeys("3175");
		//driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Address.sendKeys("64 Brady Road");
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(), ', Dandenong North, VIC, 3175')]")).click();
		NextBtn.click();
		return new VechRegLookup_Page();
	}
}
