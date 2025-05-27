package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://books.toscrape.com/catalogue/page-1.html");
		
		
		int count=1;
	
		while(count<=4) {
			try {
				WebElement page = driver.findElement(By.xpath("//a[text()='next']"));
		if(page.isDisplayed() && page.isEnabled()) {
			page.click();
			Thread.sleep(3000);
			count++;
		}else {
			break;
			
			
		}
			}catch(Exception e){
				break;
			}
		}
}
	}


