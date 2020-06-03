package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class BusinessUse_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'Private and/or commuting to work')]")
	WebElement Private;
	
	public BusinessUse_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Kilometers_Page BusinessUse() {
		Private.click();
		return new Kilometers_Page();
	}

}
