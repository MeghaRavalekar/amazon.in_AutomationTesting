package testCases;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageFactory.LoginPage;
import pageFactory.ProductPage;

public class TC2_Add_Remove_Product extends BaseClass {
       @Test
	public void BuyProducts() throws InterruptedException {

               LoginPage Login_Ob = new LoginPage(driver);

		ProductPage ProductPage_Ob = new ProductPage(driver);

		// Hover on Account And List text
		// click on Sign in button
		Login_Ob.ClickSignin();

		// Enter username and password, click on sign in Btn
		Login_Ob.Login("9699445909", "Test@1234");

		// click on header cart button
		ProductPage_Ob.OpenHeaderCart();

		// check cart items
		ProductPage_Ob.VerifyCartIetms();

		// Search Product
		ProductPage_Ob.SearchProduct("Mobile");

		// Click on Prod Name
		ProductPage_Ob.SelectProduct();

		// Go to Prod Detail Page
		Login_Ob.RedirectToProdDetailPage();

		// Add product to cart
		ProductPage_Ob.AddtoCart();

		// Change quantity of product as 2
		ProductPage_Ob.AddQuantity();

		// Delete product from cart
		ProductPage_Ob.DeleteFromCart();

	}

}
