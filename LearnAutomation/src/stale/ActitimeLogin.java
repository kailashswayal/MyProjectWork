package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-v8ho2lfd/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(4000);
		driver.navigate().refresh();// due to this command web page refreshed and all component address changed therefore StaleElementReferenceException occurred.
		username.clear();
		//driver.findElement(By.name("username")).clear() here we again find the old address
	}

}
