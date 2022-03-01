 package AutomationFramework;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismToLaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name: ");
		String browserValue=sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bing.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.close();

		}
		else if(browserValue.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.bing.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.close();

		}
		else
			System.out.println("invalid browser name");

	}

}
