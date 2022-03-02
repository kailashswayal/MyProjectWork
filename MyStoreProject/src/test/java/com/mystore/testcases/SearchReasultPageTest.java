package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchReasultPage;

public class SearchReasultPageTest extends BaseClass {
	
	IndexPage index;
	SearchReasultPage searchReasultPage;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		launchApp();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void productAvalibilityTest()
	{
		index = new IndexPage();
		searchReasultPage = index.searchProduct("t-shirt");
		boolean result = searchReasultPage.isProductAvailable();
		Assert.assertTrue(result);
		
	}


}
