package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	/*
	 * @Test public void a() { System.out.println("hii");//by we don't generates
	 * reports automatically
	 * 
	 * }
	 */

	@Test
	public void b()
	{
		Reporter.log("Demo class",true); 
	}
	@Test  
	public void a()
	{
		int i=0;
		int res= 10/i;
		System.out.println(res);
	}
}
