package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.WebDriver_Utility;

public class AddProductInfo {

	
	public AddProductInfo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement AddProduct1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement AddProduct2;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement HandleDropdown;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement AddProduct3;
	
	public WebElement getAddProduct1() {
		return AddProduct1;
	}

	public WebElement getAddProduct2() {
		return AddProduct2;
	}

	public WebElement getHandleDropdown() {
		return HandleDropdown;
	}

	public WebElement getAddProduct3() {
		return AddProduct3;
	}
	
	WebDriver_Utility wu=new WebDriver_Utility();
	public void AddProduct() throws InterruptedException{
		wu.sleep();
		AddProduct1.click();
		AddProduct2.click();
	}
	
	public void HandleDropdown() {
		WebElement data = HandleDropdown;
		wu.HandleDropdown(data, 3);
	}
	public void addNewProduct() {
		AddProduct3.click();
	}
	
}
