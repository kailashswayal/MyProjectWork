package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  WebDriver driver;
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
  } 
  @DataProvider(name="actiTimeInvalidCredentials")
  public Object[][] dataProvider()
  {
	 Object[][] data =new Object[5][2];
	 data[0][0]="admin";
	 data[0][1]="manager123";
	 data[1][0]="123admin";
	 data[1][1]="manager";
	 data[2][0]="admin$123";
	 data[2][1]="manager123";
	 data[3][0]="a123";
	 data[3][1]="manager123";
	 data[4][0]="ad min";
	 data[4][1]="manager123";
	 return data;
  }

  @Test(dataProvider ="actiTimeInvalidCredentials" )
  public void testOrangeHRM(String un,String pwd) throws InterruptedException
  {
	  driver.findElement(By.id("txtUsername")).sendKeys(un);
	  Thread.sleep(5000);
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  Thread.sleep(5000);
	  driver.findElement(By.name("Submit")).click();

  }

  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
  }

}
