package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class Parking_Page extends BaseClass{
	@FindBy(xpath="//button[@value= 'GARAGE']")
	WebElement garage;
	
	public Parking_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public VehicleDamage_Page Parking_PlaceAtNight() {
		garage.click();
		return new VehicleDamage_Page();
	}
}
