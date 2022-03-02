/**
 * 
 */
package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.AddressPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderConfirmationPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.OrderSummaryPage;
import com.mystore.pageobjects.PaymentPage;
import com.mystore.pageobjects.SearchReasultPage;
import com.mystore.pageobjects.ShippingPage;

/**
 * @author kaila
 *
 */
public class EndToEndTest extends BaseClass {
	IndexPage index;
	SearchReasultPage searchResultPage;
	AddToCartPage addToCartPage;
	OrderPage orderPage;
	LoginPage loginPage;
	AddressPage addressPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	OrderSummaryPage orderSummary;
	OrderConfirmationPage orderConfirmationPage;
	
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
	public void endToEndTest() throws Throwable
	{
		index=new IndexPage();
		searchResultPage = index.searchProduct("t-shirts");
		addToCartPage=searchResultPage.clickOnProduct();
		addToCartPage.enterQuantity("2");
		addToCartPage.selectSize("S");
		addToCartPage.clickOnAddToCart();
		orderPage=addToCartPage.clickOnCheckOut();
		loginPage=orderPage.clickOnCheckOut();
		addressPage=loginPage.login1("kailashwayal1995@gmail.com","12345678");
		shippingPage=addressPage.clickOnCheckOut();
		shippingPage.checkTheTerms();
		paymentPage=shippingPage.clickOnProceedTocheckOut();
		orderSummary=paymentPage.clickOnPaymentMethod();
		orderConfirmationPage=orderSummary.clickOnconfirmOrderBtn();
		String actualMsg = orderConfirmationPage.validateConfirmMessage();
		Assert.assertEquals(actualMsg, "Your order on My Store is complete.");
	}

}
