package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class DutyDisclouser_Page extends BaseClass{

	@FindBy(xpath="//button[contains(text(), 'I Agree & Continue')]")
	WebElement AgreeBtn;
	
	public DutyDisclouser_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Address_Page ClickOnAgree() {
		AgreeBtn.click();
		return new Address_Page();
	}
}
