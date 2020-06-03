package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class OwnAnotherCar_Page extends BaseClass{
	
	@FindBy(xpath="//span[contains(text(), 'No')]")
	WebElement NoBtn;
	
	public OwnAnotherCar_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public YoungestDriver_Page OwnAnotherCar() {
		
		NoBtn.click();
		return new YoungestDriver_Page();
	}

}
