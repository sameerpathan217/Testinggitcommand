package Generic_Utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	
	
	public void sleep() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void mouseAction(WebDriver driver,WebElement name) {
	Actions act=new Actions(driver);
	act.moveToElement(name).perform();
	}
	
	public void acceptAlert(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.accept();
	}

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void HandleDropdown(WebElement element,int index) {
		Select sat=new Select(element);
		sat.selectByIndex(index);
	}
}
