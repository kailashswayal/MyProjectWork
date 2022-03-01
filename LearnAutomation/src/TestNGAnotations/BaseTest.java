package TestNGAnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
  WebDriver driver;
  @BeforeMethod
  public void openBrowser()
  {
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://laptop-v8ho2lfd/login.do");

  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}
