/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author kaila
 *
 */
public class OrderSummaryPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span") WebElement confirmOrderBtn;

	
	public OrderSummaryPage()
	{
		PageFactory.initElements(driver, this);
	}

	public OrderConfirmationPage clickOnconfirmOrderBtn()
	{
		//Action.click(driver, confirmOrderBtn);
		confirmOrderBtn.click();
		return new OrderConfirmationPage();
	}
}
