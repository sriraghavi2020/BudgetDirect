package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class VehicleDamage_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'No Damage')]")
	WebElement damage;
	
	public VehicleDamage_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public BusinessUse_Page VehicleDamage() {
		damage.click();
		return new BusinessUse_Page();
	}

}
