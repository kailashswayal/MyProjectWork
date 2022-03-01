package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(enabled = true)
  public void f() 
  {
	  Reporter.log("test case go executed",true);
  }
  @Test(enabled = false)
  public void g() 
  {
	  Reporter.log("test case not executed",true);
  }
}
