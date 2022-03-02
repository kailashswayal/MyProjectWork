package generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant{
	
		protected  WebDriver driver;
		// we are achieving RunTime Polymorphism
		@BeforeMethod
		public void openBrowser() throws IOException {
			
		Flib flib = new Flib();
		String browserValue = flib.readProperty(PROP_PATH, "browser");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://laptop-v8ho2lfd/login.do");
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
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
		public void failed(String methodName) 
		{
			 try {
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshots/screenshot1.png");
				Files.copy(src,dest);

				}
			
			catch(Exception e) {
				
			}
		}

		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
}
