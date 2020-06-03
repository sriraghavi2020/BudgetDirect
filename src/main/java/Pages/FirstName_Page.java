package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class FirstName_Page extends BaseClass{

	@FindBy(xpath="//input[@id= 'regularDriverFirstName']")
	WebElement FirstName;
	@FindBy(xpath="//button[@type= 'submit']")
	WebElement Next;
	
	public FirstName_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public DOB_Page Fisrtname() {
	//FirstName.sendKeys("Kiriti");
		Next.click();
		return new DOB_Page();
	}
}
