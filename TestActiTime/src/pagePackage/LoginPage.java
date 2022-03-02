package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;



public class LoginPage {
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepTheLoggedInCheckBox;
	
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepTheLoggedInCheckBox() {
		return keepTheLoggedInCheckBox;
	}
	
	public void delayOfTwoSeconds() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	//generic reusable methods

	public void validLogin(String validUsername,String validPassword) 
	{
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginbtn.click();
	}
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException 
	{
		usn.sendKeys(invalidUsername);
		Thread.sleep(2000);
		psw.sendKeys(invalidPassword);
		Thread.sleep(2000);
		loginbtn.click();
		usn.clear();
	}
}
