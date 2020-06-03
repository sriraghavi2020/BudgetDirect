package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class CoverType_Page extends BaseClass{
	@FindBy(xpath="//span[contains(text(), 'Covers the loss of')]")
	WebElement Tpye;
	
	public CoverType_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Parking_Page Comphrehensive_Type() {
		Tpye.click();
		return new Parking_Page();
	}
	

}
