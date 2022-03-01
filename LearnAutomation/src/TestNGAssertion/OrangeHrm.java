package TestNGAssertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm {
  @Test
  public void testScript_2()
  {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  String homePageTitle = driver.getTitle();
	  System.out.println(homePageTitle);
	  driver.quit();
	  
	  
  }
}
