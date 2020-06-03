package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class NoClaimDisc_Page extends BaseClass{

	@FindBy(xpath="//span[contains(text(), 'Rating 5')]")
	WebElement rating;
	
	public NoClaimDisc_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public OwnAnotherCar_Page NoClaimsDiscount() {
		
		rating.click();
		return new OwnAnotherCar_Page();
	}
}
