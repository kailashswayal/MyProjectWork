package testPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import generic.WebDriverCommonLib;

import pagePackage.LoginPage;

@Listeners(CustomListner.class)
public class TestActiTimeValidLogin extends BaseTest {

	@Test
	public void login() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String validUsername = flib.readProperty(PROP_PATH, "un");
		String validPassword = flib.readProperty(PROP_PATH, "pwd");
		
		lp.validLogin(validUsername, validPassword);
		
		WebDriverCommonLib wb= new WebDriverCommonLib();
		String actualHomePagetitle = wb.getTheTitleOfTheWebpage();
		Thread.sleep(2000);
		Assert.assertEquals(actualHomePagetitle, "suraj");
	}

	

}
