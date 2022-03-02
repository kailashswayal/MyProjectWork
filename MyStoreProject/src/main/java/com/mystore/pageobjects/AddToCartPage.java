/**
 * 
 */
package com.mystore.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author kaila
 *
 */
public class AddToCartPage extends BaseClass {
	
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]") WebElement quantity;
	@FindBy(xpath="//*[@id=\"group_1\"]") WebElement size;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span") WebElement addToCartBtn;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2") WebElement addToCartMessage;
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]") WebElement proceedToCheckOutBtn;
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void enterQuantity(String quantity1)
	{
		quantity.clear();
		quantity.sendKeys(quantity1);
		//Action.type(quantity, quantity1);
	}
	public void selectSize(String size1)
	{
		
		Action.selectByVisibleText(size, size1);
	}

	public void clickOnAddToCart()
	{
		addToCartBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	public boolean validateAddToCart() 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//return Action.isDisplayed(driver, addToCartMessage);
		return addToCartMessage.isDisplayed();
	}
	public OrderPage clickOnCheckOut() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Action.fluentWaits(proceedToCheckOutBtn,10);
		Thread.sleep(5000);

		Action.JSClick(driver, proceedToCheckOutBtn);

		return new OrderPage();
	}

}
