package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WebDriverCommonLib extends BaseTest {
	
	public String getTheTitleOfTheWebpage()
	{
		String title = driver.getTitle();
		return title;	
	}
	
	public void verifyThePageTitle(String pageTitle)
	{
		String title = driver.getTitle();
		if(pageTitle.equals(title))
		{
			System.out.println(pageTitle+"page is verified");
		}
		else
		{
			System.out.println(pageTitle+"page is not verified");
		}
	
	}
	
	public void mouseHover(WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element);
	}
	
	public void rightClick(WebElement element)
	
	{
		Actions act = new Actions(driver);
		act.contextClick(element);
	}
	
	public void doubleClick(WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick();
	}
	
	public void dragAndDrop(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
	}
	
	public void switchToFrameByIndex()
	{
		driver.switchTo().frame(1);
	}
	
	public void switchToFrameByValue(String value)
	{
		driver.switchTo().frame(value);
	}
	/*
	 * getTheTitleOfTheWebPage verifyThePageTitle mouseHover rightClick doubleClick
	 * dragAndDrop switchToFrame switchToFrame switchToFrame selectTheOption
	 * selectTheOption selectTheOption getAllOptionsOfDropdown implicitlyWait
	 * scrollRight scrollLeft scrollDown scrollUp scrollTillPerticularWebELement
	 * takeTheScreensHotOfWebpage acceptAlertPopup acceptConfirmationPopup
	 * getTheWindowHandle getTheWindowHandles refreshTheBrowser
	 */


	

}
