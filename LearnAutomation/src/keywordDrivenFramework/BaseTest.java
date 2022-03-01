package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
		static WebDriver driver;
		
		public void openBrowser() throws IOException {
			
		Flib flib = new Flib();
		String browserValue = flib.readProperty("./data/config.properties", "browser");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://laptop-v8ho2lfd/login.do");
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://laptop-v8ho2lfd/login.do");
		}
		else 
		{
			System.out.println("Invalid Option");
		}
}
		public void closeBrowser()
		{
			driver.quit();
		}
}
