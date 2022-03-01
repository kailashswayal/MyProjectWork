package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.id("username")).sendKeys("kailash");
		driver.findElement(By.id("password")).sendKeys("kailash1");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();

		

	}

}
