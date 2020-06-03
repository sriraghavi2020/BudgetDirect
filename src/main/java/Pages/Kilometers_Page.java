package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Kilometers_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'Over 30,000km')]")
	WebElement Km;
	
	public Kilometers_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Finance_Page AvgKms() {
		Km.click();
		return new Finance_Page();
	}
}
