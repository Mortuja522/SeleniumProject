package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class LoginPageTest extends Baseclass {
	
	 IndexPage indexPage;
	 LoginPage loginPage;
	 HomePage  homePage;
	
	
@BeforeMethod
	
	public void setup() {
		launchApp(); 
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginTest() throws Throwable{
		
		
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		String actualURL=homePage.getCurrentURL();
		String expectedURL="http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}
