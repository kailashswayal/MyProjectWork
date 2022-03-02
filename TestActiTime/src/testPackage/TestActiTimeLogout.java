package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
@Listeners(CustomListner.class)

public class TestActiTimeLogout extends BaseTest{
	@Test
	public void testActiTimeLogout() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		String validUsername = flib.readProperty(PROP_PATH, "un");
		String validPassword = flib.readProperty(PROP_PATH, "pwd");

		lp.validLogin(validUsername, validPassword);

		HomePage hp = new HomePage(driver);
		Thread.sleep(8000);
		hp.logout();
	}
}


