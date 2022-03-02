package com.mystore.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoConstant 
{
	public static Properties prop;
	protected static  WebDriver driver;
	// we are achieving RunTime Polymorphism
	
	
	/*
	 * @BeforeSuite public void beforeSuite() {
	 * DOMConfigurator.configure("log4j.xml"); }
	 */
	
	public void launchApp() throws IOException
	{
		
	Flib flib = new Flib();
	String browserValue = flib.readProperty(PROP_PATH, "browser");
	
	if(browserValue.equals("Chrome"))
	{
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	else if(browserValue.equals("Firefox"))
	{
		System.setProperty(GECKO_KEY,GECKO_PATH);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	else 
	{
		System.out.println("Invalid Option");
	}
	}
}