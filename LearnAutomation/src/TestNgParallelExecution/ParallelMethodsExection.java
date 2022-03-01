package TestNgParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelMethodsExection {
  @Test
  public void method1()
  {
	  Reporter.log("method1",true);
	  Reporter.log(Thread.currentThread().getId()+" ",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("method2",true);
	  Reporter.log(Thread.currentThread().getId()+" ",true);
  }
}
