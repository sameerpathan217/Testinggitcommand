package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Excel_Utility;
import Generic_Utility.WebDriver_Utility;

public class AddProductCart {
	
		
		public AddProductCart(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement AddCart;
		
		
		@FindBy(id="checkout")
		private WebElement checkOut;
		
		@FindBy(id="first-name")
		private WebElement firstName;
		
		@FindBy(id="last-name")
		private WebElement lastName;
		
		@FindBy(id="postal-code")
		private WebElement pincode;
		
		@FindBy(id="continue")
		private WebElement continueOrder;
		
		@FindBy(id="finish")
		private WebElement FinishOrder;
		
		
		
		
		public WebElement getAddCart() {
			return AddCart;
		}

		public WebElement getCheckOut() {
			return checkOut;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getPincode() {
			return pincode;
		}

		public WebElement getContinueOrder() {
			return continueOrder;
		}

		public WebElement getFinishOrder() {
			return FinishOrder;
		}
		
		
		public void AddToCart() {
			AddCart.click();
			checkOut.click();
		}
		
		public void OrderInfo() throws EncryptedDocumentException, IOException, InterruptedException {
			Excel_Utility eu=new Excel_Utility();
			WebDriver_Utility wu=new WebDriver_Utility();
			String data1 = eu.AcceptExcelData("Sheet1", 1, 0);
			String data2 = eu.AcceptExcelData("Sheet1", 1, 1);
		    String data3 = eu.AcceptExcelData("Sheet1", 1, 2);
			
			firstName.sendKeys(data1);
			wu.sleep();
			lastName.sendKeys(data2);
			wu.sleep();
			pincode.sendKeys(data3);
			wu.sleep();
		}
		
		public void ConfirmOrder() {
			continueOrder.click();
			FinishOrder.click();
		}
		

}
