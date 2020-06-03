package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class NonStandAccess_Page extends BaseClass{
	@FindBy(xpath="//button[@value='NO']")
	WebElement NoBtn;
	
	public NonStandAccess_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Modification_Page AccessoriesOpt() {
		NoBtn.click();
		return new Modification_Page();
	}

}
