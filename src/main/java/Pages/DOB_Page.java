package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class DOB_Page extends BaseClass{
	@FindBy(xpath="//input[@id= 'day']")
	WebElement date;
	@FindBy(xpath="//input[@id= 'month']")
	WebElement month;
	@FindBy(xpath="//input[@id= 'year']")
	WebElement year;
	@FindBy(xpath="//button[@type= 'submit']")
	WebElement Next;
	
	public DOB_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Gender_Page DOB() {
		
		date.sendKeys("21");
		month.sendKeys("10");
		year.sendKeys("1990");
		Next.click();
		return new Gender_Page();
	}
}
