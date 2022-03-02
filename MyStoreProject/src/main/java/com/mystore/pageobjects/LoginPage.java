/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author kaila
 *
 */
public class LoginPage extends BaseClass {
	@FindBy(id="email") WebElement usname;
	@FindBy(name="passwd") WebElement pword;
	@FindBy(id="SubmitLogin") WebElement signBtn;
	@FindBy(name="email_create") WebElement emailForNewAccount;
	@FindBy(name="SubmitCreate") WebElement createNewAccountBtn;
	
	
	//initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public HomePage login(String uname,String pswd)
	{
		usname.sendKeys(uname);
		pword.sendKeys(pswd);
		signBtn.click();
		return new HomePage();
	}
	public AddressPage login1(String uname,String pswd)
	{/*
		 * Action.type(usname, uname); Action.type(pword, pswd); Action.click(driver,
		 * signBtn);
		 */
		usname.sendKeys(uname);
		pword.sendKeys(pswd);
		signBtn.click();
		
		return new AddressPage();
	}
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable
	{ 
		Action.type(emailForNewAccount, newEmail);
		createNewAccountBtn.click();
		return new AccountCreationPage();
	}
}
