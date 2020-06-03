package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baseclass.BaseClass;
import Util.Test_Util;

public class VechRegLookup_Page extends BaseClass{
	@FindBy(xpath="//input[@id='plateNumber']")
	WebElement RegNum;
	@FindBy(xpath="//button[@id='nextButton']")
	WebElement NextBtn;
	
	public VechRegLookup_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public VechRegConfirmation_Page VechRegDetails() {
		RegNum.sendKeys("WWI559");
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		NextBtn.click();
		return new VechRegConfirmation_Page();
	}
}
