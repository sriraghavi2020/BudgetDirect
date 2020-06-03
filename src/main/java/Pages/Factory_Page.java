package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Factory_Page extends BaseClass{
	@FindBy(xpath="//button[contains(text(), 'No Factory Options')]")
	WebElement NextBtn;
	
	public Factory_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public NonStandAccess_Page NoFactoryOpt() {
		NextBtn.click();
		return new NonStandAccess_Page();
	}
}
