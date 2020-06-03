package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Modification_Page extends BaseClass{
	@FindBy(xpath="//button[@value='NO']")
	WebElement NoBtn;
	
	public Modification_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public CoverType_Page Modifications() {
		NoBtn.click();
		return new CoverType_Page();
	}


}
