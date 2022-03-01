package takeScreenShotDynamically;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
@Listeners(CustomListner.class)
public class TestOrangeHRM extends BaseTest{
  @BeforeMethod
  public void setUp() 
  {
	  initialization();
  }

   
  @Test
  public void testOrangeHRM()
  {
	  String actualLoginPageTitle = driver.getTitle();
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM123");
	  softAssert.assertAll();
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }

}
