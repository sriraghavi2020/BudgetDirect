package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Email_Page extends BaseClass{

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Nxt;
			 
	public Email_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public PricePresentation_Page email() {
		email.sendKeys("raghavi@gmail.com");
		Nxt.click();
		return new PricePresentation_Page();
	}
}
