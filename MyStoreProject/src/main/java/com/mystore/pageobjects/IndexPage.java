package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Baseclass;

public class IndexPage extends Baseclass {
	
	@FindBy(xpath="//a[@class='login']")
	
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	 WebElement myStoreLogo;
	
	@FindBy(id="search_query_top")
	 WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements( driver, this);
	}
	
	public LoginPage clickOnSignIn() throws Throwable {
		
		Action.click(driver, signInBtn);
		return new LoginPage();
		
	}
}
