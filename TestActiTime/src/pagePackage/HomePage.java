package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutLink;
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropDown;
	@FindBy(id="submitTTButton") private WebElement saveLeaveTimeButton;
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getLogotLink() {
		return logoutLink;
	}
	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
		
	}
	public void logout()
	{
		logoutLink.click();
	}
	
}
