package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flag7 {
	/*
	 * @BeforeMethod public void a() {
	 * Reporter.log("*******************************",true); }
	 */
	@Test(groups = "functional")
	public void ft1() 
	{
		Reporter.log("functional test case 1",true);
	}

	@Test(groups = "smoke")
	public void st1() 
	{
		Reporter.log("Smoke test case 1",true);
	}
	@Test(groups = "integration")
	public void it1() 
	{
		Reporter.log("integration test case 1",true);
	}

	////////////
	@Test(groups = "functional")
	public void ft2() 
	{
		Reporter.log("functional test case 2",true);
	}
	@Test(groups = "smoke")
	public void st2() 
	{
		Reporter.log("Smoke test case 2",true);
	}
	@Test(groups = "integration")
	public void it2() 
	{
		Reporter.log("integration test case 2",true);
	}
	////////
	@Test(groups = "functional")
	public void ft3() 
	{
		Reporter.log("functional test case 3",true);
	}
	@Test(groups = "smoke")
	public void st3() 
	{
		Reporter.log("Smoke test case 3",true);
	}
	@Test(groups = "integration")
	public void it3() 
	{
		Reporter.log("integration test case 3",true);
	}
	////////
	@Test(groups = "functional")
	public void ft4() 
	{
		Reporter.log("functional test case 4",true);
	}
	@Test(groups = "smoke")
	public void st4() 
	{
		Reporter.log("Smoke test case 4",true);
	}
	@Test(groups = "integration")
	public void it4() 
	{
		Reporter.log("integration test case 4",true);
	}
	///////
	@Test(groups = "functional")
	public void ft5() 
	{
		Reporter.log("functional test case 5",true);
	}
	@Test(groups = "smoke")
	public void st5() 
	{
		Reporter.log("Smoke test case 5",true);
	}
	@Test(groups = "integration")
	public void it5() 
	{
		Reporter.log("integration test case 5",true);
	}
	////
	@Test(groups = "functional")
	public void ft6() 
	{
		Reporter.log("functional test case 6",true);
	}
	@Test(groups = "smoke")
	public void st6() 
	{
		Reporter.log("Smoke test case 6",true);
	}
	@Test(groups = "integration")
	public void it6() 
	{
		Reporter.log("integration test case 6",true);
	}

}
