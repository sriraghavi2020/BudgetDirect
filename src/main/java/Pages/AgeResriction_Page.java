package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class AgeResriction_Page extends BaseClass{
	
	
	@FindBy(xpath="//span[contains(text(), 'No Age Restriction')]")
    WebElement NoAgeRes;
	
	public AgeResriction_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public PolicyStartDate_Page AgeResriction() {
		
		NoAgeRes.click();
		return new PolicyStartDate_Page();
	}


}
