package Pages;

//import java.util.Calendar;
import java.util.List;
//import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class PolicyStartDate_Page extends BaseClass{
@FindBy(xpath="//button[@type= 'submit']")
WebElement Nxt;
	// public String today;
	 
public PolicyStartDate_Page() {
	PageFactory.initElements(driver, this);
}

	
	public Email_Page PolicyStartDate() {
		 //today = getCurrentDay();
		 WebElement dateWidget = driver.findElement(By.tagName("tbody"));
		 List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

		 for (WebElement cell: columns) {
	          
	            if (cell.getText().contains("Today")) {
	                cell.click();
	                break;
	            }
	        }
		Nxt.click();
		return new Email_Page();
	}
	
	 /*private String getCurrentDay (){
	        //Create a Calendar Object
	        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	 
	        //Get Current Day as a number
	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
	        System.out.println("Today Int: " + todayInt +"\n");
	 
	        //Integer to String Conversion
	        String todayStr = Integer.toString(todayInt);
	        System.out.println("Today Str: " + todayStr + "\n");
	 
	        return todayStr;
	    }
	    */
}
