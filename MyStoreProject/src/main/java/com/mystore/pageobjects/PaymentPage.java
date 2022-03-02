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
public class PaymentPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a") WebElement bankWireMethod;
	
	@FindBy(xpath="//a[contains(text(),'pay by check')]") WebElement payByCheckMethod;

	
	
	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
	}
	public OrderSummaryPage clickOnPaymentMethod()
	{
		//Action.click(driver, bankWireMethod);
		bankWireMethod.click();
		return new OrderSummaryPage();
	}

}
