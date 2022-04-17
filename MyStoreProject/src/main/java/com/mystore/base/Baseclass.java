package com.mystore.base;

import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.mystore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	

	public static WebDriver driver;
	public static Properties prop;
	
	public void launchApp() {
		
	    WebDriverManager.chromedriver().setup();
		String browserName1= prop.getProperty("browser");
		
		if (browserName1.contains("Chrome")) {
			
			driver = new ChromeDriver();
		} else if (browserName1.contains("FireFox")) {
			
			driver = new FirefoxDriver();
		} else if (browserName1.contains("IE")) {
	
			driver = new InternetExplorerDriver();
		}
			
		driver.manage().window().maximize();
		Action.pageLoadTimeOut(driver, 80);
		driver.get(prop.getProperty("url"));
				
	}
	
		
	}
	
	
	


