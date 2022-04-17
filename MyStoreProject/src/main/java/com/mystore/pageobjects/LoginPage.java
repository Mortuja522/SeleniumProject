/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Baseclass;

/**
 * @author mortuja
 *
 */
public class LoginPage extends Baseclass {
	
	
	
	@FindBy(id="email")
	 WebElement userName;
	
	@FindBy(id="passwd")
	 WebElement password;

	@FindBy(id="SubmitLogin")
	 WebElement signInBtn;
	
	@FindBy(name="email_create")
	 WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	 WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pswd) throws Throwable {

		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		Action.type(emailForNewAccount, newEmail);
		return new AccountCreationPage();
	}
	
	

}
