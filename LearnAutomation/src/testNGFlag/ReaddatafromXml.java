 package testNGFlag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReaddatafromXml {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void openBrowser(String browserValue) 
	{

		if(browserValue.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("chromebrowser");
		}

		else if(browserValue.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("firefoxbrowser");
		}
		
		else {
			Reporter.log("invalid browser value");
		}
			
			

	}
}
