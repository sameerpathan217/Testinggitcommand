package HomePage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import POM.AddProductInfo;

@Listeners(Generic_Utility.Listener.class)
public class ProductInfo extends BaseClass{
	@Test(groups= {"smoke"})
	public void Info() throws InterruptedException {
		
		AddProductInfo api=new AddProductInfo(driver);
		api.AddProduct();
		api.HandleDropdown();
		api.addNewProduct();
		
	}
	@Test(groups= {"sanity"})
	public void addMember() {
		System.out.println("Data added successfully");
	}
	@Test(groups="smoke")
	public void deleteMember() {
		System.out.println("Data deleted successfully");
	}

}
