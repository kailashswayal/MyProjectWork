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
public class ShippingPage extends BaseClass {
	
	@FindBy(id="cgv") WebElement terms;
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]") WebElement proceedToCkeckOutBtn;
	
	
	public ShippingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms()
	{
		//Action.click(driver, terms);
		terms.click();
	}
	public PaymentPage clickOnProceedTocheckOut()
	{
		//Action.click(driver, proceedToCkeckOutBtn);
		proceedToCkeckOutBtn.click();
		return new PaymentPage();
	}

}
