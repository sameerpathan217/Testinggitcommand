package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Property_Utility;
import Generic_Utility.WebDriver_Utility;


public class LoginModule {
	
	public LoginModule(WebDriver driver) {
      PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	private WebElement userName;

	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement OpenLogoutMenu;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logoutButton;
	
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getOpenLogoutMenu() {
		return OpenLogoutMenu;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void SauceLogin() throws IOException {
		Property_Utility pu =new Property_Utility();
		WebElement un = userName;
		String data = pu.ReadPropertyData("Username");
		un.sendKeys(data);
		
		WebElement pass = Password;
		String data1 = pu.ReadPropertyData("Password");
		pass.sendKeys(data1);
		
		loginButton.click();	
		
	}
	public void LogoutModule() throws InterruptedException {
		WebDriver_Utility wu=new WebDriver_Utility();
		
		OpenLogoutMenu.click();
		wu.sleep();
		logoutButton.click();
	}
}
