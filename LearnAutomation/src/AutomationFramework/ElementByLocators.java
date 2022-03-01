package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementByLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://laptop-v8ho2lfd/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("admin");
		driver.findElement(By.className("q")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.cssSelector("//input[@name='username']")).sendKeys("admin123");
		driver.findElement(By.id("I1#dfh")).click();
		
		
		driver.close();

	}

}
