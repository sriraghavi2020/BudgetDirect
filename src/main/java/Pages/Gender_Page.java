package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Gender_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'Male')]")
	WebElement genderM;
	
	public Gender_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Claims_Page gender() {
		
		genderM.click();
		return new Claims_Page();
	}

}
