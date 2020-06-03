package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;


public class VechRegConfirmation_Page  extends BaseClass{
	@FindBy(xpath="//div[contains(text(), 'Yes, this is my car')]")
	WebElement NextBtn;
	
	public VechRegConfirmation_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Factory_Page VechRegConfirmation() {
		NextBtn.click();
		return new Factory_Page();
	}

}
