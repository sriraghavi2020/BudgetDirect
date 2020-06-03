package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Quote_Page extends BaseClass{
	
	@FindBy(xpath="//div[@class='product-block-v2__btn']//a[contains(@href, 'start/gold-car.html')]")
	WebElement getQuote;
	
	
	public Quote_Page() {
		PageFactory.initElements(driver, this);
	}
	public DutyDisclouser_Page clickOnGetQuote_Car() {
		getQuote.click();
		return new DutyDisclouser_Page();
	}

}
