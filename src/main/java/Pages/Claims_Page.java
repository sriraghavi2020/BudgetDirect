package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Claims_Page extends BaseClass{

	@FindBy(xpath="//div[contains(text(), 'No')]")
	WebElement NoClaim;
	
	public Claims_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public NoClaimDisc_Page claims() {
		
		NoClaim.click();
		return new NoClaimDisc_Page();
	}
}
