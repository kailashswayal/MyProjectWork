package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagePackage.LoginPage;

@Listeners(CustomListner.class)

public class TestActiTimeInvalidLogin extends BaseTest
{
	@Test
	public void testActiTimeInvalidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();

		int rc = flib.getRowcount("./Data/Testdata.xlsx","invalidcreds");

		for(int i=0; i<rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			lp.invalidLogin(invalidUsername, invalidPassword);
		}
	}



}

