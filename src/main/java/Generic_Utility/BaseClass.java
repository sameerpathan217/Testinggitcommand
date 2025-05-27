package Generic_Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.LoginModule;

public class BaseClass {
	public static WebDriver sdriver;
   public WebDriver driver;
	Property_Utility pu =new Property_Utility();
	WebDriver_Utility wu=new WebDriver_Utility();
	LoginModule lm;
	
	@BeforeClass(groups={"smoke","SanityCheck","Regression","sanity"})
	public void BC() throws IOException {
	
		String URL = pu.ReadPropertyData("url");
		String BrowserName = pu.ReadPropertyData("Browser");
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			driver.get(URL);
		}else if(BrowserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.get(URL);
		}else {
			System.out.println("Wrong Choice");
		}
		sdriver=driver;
		
		
	}
	
	@BeforeMethod(groups={"smoke","SanityCheck","Regression","sanity"})
	public void BM() throws IOException {
		wu.maximizeWindow(driver);
		lm=new LoginModule(driver);
		lm.SauceLogin();
	}
	
	
	@AfterMethod (groups={"smoke","SanityCheck","Regression","sanity"})
	public void AM() throws InterruptedException {
		lm.LogoutModule();
	}
	@AfterClass(groups={"smoke","SanityCheck","Regression","sanity"})
	public void AC() {
		driver.close();
	}
	

}


