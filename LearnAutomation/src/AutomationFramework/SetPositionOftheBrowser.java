package AutomationFramework;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOftheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		Point targetPosition = new Point(700,300);
		
		//driver.manage().window().setPosition(targetPosition);
		driver.get("https://www.google.com/");

		Dimension targetSize = new Dimension(500,300);
		//driver.manage().window().setSize(targetSize);
		

	}

}
