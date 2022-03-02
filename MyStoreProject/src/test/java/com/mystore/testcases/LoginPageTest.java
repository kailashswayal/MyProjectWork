package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.base.Flib;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class LoginPageTest extends BaseClass{

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	@BeforeMethod
	public void setUp() throws IOException
	{
		launchApp();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void loginTest() throws IOException
	{
		//Log.startTestCase("loginTest");
		indexPage = new IndexPage();
		//Log.info("user is going to click on SignIn");
		loginPage = indexPage.clickOnSignIn();
		//homePage=loginPage.login(flib.readProperty(PROP_PATH,"username"), flib.readProperty(PROP_PATH,"password"));
		//Log.info("Enter username and password");

		homePage=loginPage.login("kailashwayal1995@gmail.com","12345678");
		String actualURL = homePage.getCurrentURL();
		//Log.info("Verify if user is able to login");
		Assert.assertEquals(actualURL, "http://automationpractice.com/index.php?controller=my-account");
		//Log.info("Login is success");
		//Log.endTestCase("loginTest");
	}


}
