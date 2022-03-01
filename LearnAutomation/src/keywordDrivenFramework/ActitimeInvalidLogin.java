package keywordDrivenFramework;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser(); 
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Flib flib = new Flib();
		
		int rc = flib.getRowCount("./data/Testdata.xlsx","invalidcreds");
		for(int i=0;i<rc;i++)
		{
			String user = flib.readExcelData("./data/Testdata.xlsx","invalidcreds", i, 0);
			driver.findElement(By.name("username")).sendKeys(user);

			String pass = flib.readExcelData("./data/Testdata.xlsx","invalidcreds", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(pass);
		
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);

			driver.findElement(By.name("username")).clear();
	
		}
	
	}

}
