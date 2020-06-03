package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Finance_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'No')]")
	WebElement NoBtn;
	
	public Finance_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public FirstName_Page LoanEnquiry() {
		NoBtn.click();
		return new FirstName_Page();
	}

}
