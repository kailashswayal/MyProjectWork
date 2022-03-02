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
public class OrderPage extends BaseClass {
	
	@FindBy(xpath="//td[@class='cart_unit']/span/span") WebElement unitPrice;
	//@FindBy(id="total_price") WebElement totalPrice;
	@FindBy(xpath="//span[text()='Proceed to checkout']") WebElement proceedToCheckout;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/span") WebElement totalPrice;

	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	public double getUnitPrice()
	{
		String unitPrice1 = unitPrice.getText();
		String unit = unitPrice1.replaceAll("^[a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice;
	}
	
	public double getTotalPrice()
	{
		String totalPrice = unitPrice.getText();
		String total = totalPrice.replaceAll("^[a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(total);
		return finalTotalPrice/100;
	}
	public LoginPage clickOnCheckOut()
	{
		//Action.click(driver, proceedToCheckout);
		proceedToCheckout.click();
		return new LoginPage();
	}
	
	
	
	
    
}
