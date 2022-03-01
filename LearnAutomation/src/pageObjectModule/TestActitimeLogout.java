package pageObjectModule;

import java.io.IOException;

public class TestActitimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String validUsername = flib.readProperty(PROP_PATH, "un");
		String validPassword = flib.readProperty(PROP_PATH, "pwd");
		
		lp.validLogin(validUsername, validPassword);
		
		Homepage hp = new Homepage(driver);
		Thread.sleep(8000);
		hp.logout();
		bt.closeBrowser();

	}

	  
}
