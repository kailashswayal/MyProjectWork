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
public class OrderConfirmationPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/p/strong") WebElement confirmMessag;
	
	
	public OrderConfirmationPage ()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateConfirmMessage()
	{
		String confirmMsg = confirmMessag.getText();
		
		return confirmMsg;
	}
}
