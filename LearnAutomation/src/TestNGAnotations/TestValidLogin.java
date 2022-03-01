package TestNGAnotations;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest{
	/*
	 * @BeforeClass public void beforeClass() { Reporter.log("before class ",true);
	 * }
	 * 
	 * @AfterClass public void afterClass() { Reporter.log("after class "); }
	 */
  @Test
  public void validLogin()
  {
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("LoginButton")).click();
		
  }
}
