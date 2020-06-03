package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Util.Test_Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;



//import Utility.EventHandler;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	//public static EventFiringWebDriver FiringDriver;
	//public static EventHandler handler;
	
	
	public static void initialization() {
		
		
		if(readPropsFile("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//FiringDriver = new EventFiringWebDriver(driver);
		//handler = new EventHandler();
		//FiringDriver.register(handler);
		//driver = FiringDriver;
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(readPropsFile("URL"));
		
		
	
	
}

public static String readPropsFile(String readProp) {
	String propField = "";
	try {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Kiriti\\eclipse-workspace\\BudgetDirectTest\\src\\main\\java\\Environmental_Config\\Detail.properties");
		prop.load(file);
	
		propField = prop.getProperty(readProp);
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	return propField;
	
}
}
