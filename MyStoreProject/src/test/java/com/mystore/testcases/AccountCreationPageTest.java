package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass{


	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountCreation;

	@BeforeMethod
	public void setUp() throws IOException
	{
		launchApp();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void verifycreateAccountPageTest() throws Throwable
	{
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		accountCreation = loginPage.createNewAccount("abcd143dgfggh@gmail.com");
		boolean result = accountCreation.validateAccountCreationPage();
		Assert.assertTrue(result);
	}

}
