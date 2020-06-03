package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class YoungestDriver_Page extends BaseClass{

	@FindBy(xpath="//span[contains(text(), 'No')]")
	WebElement NoBtn;
	
	public YoungestDriver_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public AgeResriction_Page YoungestDriver() {
		
		NoBtn.click();
		return new AgeResriction_Page();
	}

}
