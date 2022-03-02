package com.mystore.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") WebElement signInBtn;
	@FindBy(xpath="//img[@class='logo img-responsive']") WebElement myStoreLogo;
	@FindBy(id="search_query_top") WebElement searchProductBox;
	@FindBy(name="submit_search") WebElement searchButton;
	
	
	//initialization
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnSignIn()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		signInBtn.click();
		return new LoginPage();
	}
	public boolean validateLogo()
	{
		return Action.isDisplayed(driver, myStoreLogo);
	}
	public String getMyStoreTitle()
	{
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
	public SearchReasultPage searchProduct(String productName)
	{
		//Action.type(searchProductBox, productName);
		searchProductBox.sendKeys(productName);
		//Action.click(driver, searchButton);
		searchButton.click();
		return new SearchReasultPage();
	}
}
