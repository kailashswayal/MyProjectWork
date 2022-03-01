package pageObjectModule;

import java.io.IOException;

public class TestActitimeValidLogin extends BaseTest {
	public static void main (String[] args) throws IOException, InterruptedException {
	
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	LoginPage lp = new LoginPage(driver);
	/*
	 * lp.sendUsername(); lp.delayOfTwoSeconds(); lp.sendPassword();
	 * lp.delayOfTwoSeconds(); lp.clickOnLoginbutton();
	 */
	Flib flib = new Flib();
	String validUsername = flib.readProperty(PROP_PATH, "un");
	String validPassword = flib.readProperty(PROP_PATH, "pwd");
	lp.validLogin(validUsername, validPassword);
	bt.closeBrowser();
	
	
	
	
	}
}
