package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {


		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		String username =flib.readProperty("./data/config.properties", "un");
		driver.findElement(By.name("username")).sendKeys(username);
		
		String password= flib.readProperty("./data/config.properties", "pwd");
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("LoginButton")).click();
		Thread.sleep(8000);
		bt.closeBrowser();
		
	}

}
