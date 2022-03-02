package com.mystore.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.mystore.base.BaseClass;

public class Action extends BaseClass {
	
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView();", ele);
	}
	public static void click(WebElement locatorName)
	{
		Actions act = new Actions(driver);
		act.moveToElement(locatorName).click().build().perform();
	}
	public static boolean findElement(WebDriver driver1,WebElement ele)
	{
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		} catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Successfully found element at");
			}else {
				System.out.println("Unable to locate element at");

			}
		}
		return flag;
		
	}
	public static boolean isDisplayed(WebDriver driver1,WebElement ele)
	{
		boolean flag=false;
		flag=findElement(driver1,ele);
		if(flag) {
			flag = ele.isDisplayed();
			if(flag) {
		
				System.out.println("the element is displayed");
			}else {
				System.out.println("the element is not displayed");
			}
			
		}else {
				System.out.println("Not displayed");
			}
			return flag;
		
	}
	public static boolean isSelected(WebDriver driver1,WebElement ele)
	{
		boolean flag=false;
		flag=findElement(driver1,ele);
		if(flag) {
			flag = ele.isSelected();
			if(flag) {
		
				System.out.println("the element is Selected");
			}else {
				System.out.println("the element is not Selected");
			}
			
		}else {
				System.out.println("Not Selected");
			}
			return flag;	
	}
	public static boolean isEnabled(WebDriver driver1,WebElement ele)
	{
		boolean flag=false;
		flag=findElement(driver1,ele);
		if(flag) {
			flag = ele.isEnabled();
			if(flag) {
		
				System.out.println("the element is Enabled");
			}else {
				System.out.println("the element is not Enabled");
			}
			
		}else {
				System.out.println("Not Enabled");
			}
			return flag;
	}
	public static boolean type(WebElement ele, String text)
	{
		boolean flag=false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		} catch(Exception e) {
			System.out.println("Location not found");
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Successfully entered value");
			}else {
				System.out.println("Unable to clear value");

			}
		}
		return flag;

	}
	public static boolean selectBySendkeys(WebElement ele, String value)
	{
		boolean flag=false;
		try {
			ele.sendKeys(value);
			flag=true;
			return true;
		} catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Select value from the Dropdown");
			}else {
				System.out.println("Not selected value from the Dropdown");

			}
		}
		return flag;

	}
	
	public static boolean switchToDefaultFrame()
	{
		boolean flag=false;
		try {
			driver.switchTo().defaultContent();
			flag=true;
			return true;
		} catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Frame is Selected");
			}else {
				//System.out.println("Frame is not Selected");

			}
		}
		return flag;
	}
	public static void moveOverElement(WebElement element)
	{
		boolean flag=false;
		try {
			new Actions(driver).moveToElement(element).build().perform();
			flag=true;
		} catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
				System.out.println("MouseOver action is performed on");
			}else {
				System.out.println("MouseOver action is not performed on");

			}
		}
	}
	public static void selectByVisibleText(WebElement ele, String value)
	{

			Select sl = new Select(ele);
			sl.selectByVisibleText(value);
			
	}
	
	public static boolean JSClick(WebDriver driver, WebElement ele)
	{
		boolean flag=false;
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			flag=true;
			 
		} catch(Exception e) {
			flag=false;
		}finally {
			if(flag) {
				System.out.println("Click action is performed");
			}else {
				System.out.println("Frame is not Selected");

			}
		}
		return flag;
	}
	public static void fluentWaits(WebElement proceedToCheckOutBtn, int i) {
		// TODO Auto-generated method stub
		
	}
	public static void click(WebDriver driver, WebElement proceedToCheckout) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
