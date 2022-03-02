package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.SearchReasultPage;

public class OrderPageTest extends BaseClass {
	
	IndexPage index;
	SearchReasultPage searchResultPage;
	AddToCartPage addToCartPage;
	OrderPage orderpage;
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
	public void verifyTotalPrice() throws Throwable
	{
		index=new IndexPage();
		searchResultPage = index.searchProduct("t-shirt");
		addToCartPage=searchResultPage.clickOnProduct();
		addToCartPage.enterQuantity("2");
		addToCartPage.selectSize("S");
		addToCartPage.clickOnAddToCart();
		orderpage=addToCartPage.clickOnCheckOut();
		double unitPrice = orderpage.getUnitPrice();
		double totalPrice = orderpage.getTotalPrice();
		double totalExpectedPrice = (unitPrice*2)+2;
		Assert.assertEquals(totalPrice, totalExpectedPrice);
		//Assert.assertEquals(totalPrice, "35.02");

	}


}
