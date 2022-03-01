package TestNgParallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Class2 {
	WebDriver driver;
	  @Test
	  public void test2() 
	  {
		  driver.switchTo().activeElement().sendKeys("Chennai Super kings",Keys.ENTER);
	  }
	  @BeforeMethod
	  public void openBrowser()
	  {
		    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.google.com/");

	  }

	  @AfterMethod
	  public void closeBrowser()
	  {
		  driver.quit();
	  }

	}
