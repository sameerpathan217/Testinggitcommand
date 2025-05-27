package HomePage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import POM.AddProductCart;
import POM.AddProductInfo;
@Listeners(Generic_Utility.Listener.class)
public class AddToCart extends BaseClass{
@Test(retryAnalyzer=Generic_Utility.RetryImpClass.class)

public void AddProduct() throws EncryptedDocumentException, IOException, InterruptedException{
	AddProductCart apc=new AddProductCart(driver);
	 AddProductInfo api=new  AddProductInfo(driver);
	 api.AddProduct();
	apc.AddToCart();
	apc.OrderInfo();
	apc.ConfirmOrder();
		
}
	
}
