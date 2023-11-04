package testCases;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageFactory.LoginPage;
import pageFactory.ProductPage;
import pageFactory.WishListPage;

public class TC4_AddProduct_ToWishList extends BaseClass {
	@Test
	public void AddProduct_Wishlist() throws InterruptedException {
		LoginPage Login_Ob = new LoginPage(driver);
		ProductPage ProductPage_Ob = new ProductPage(driver);
		WishListPage WishList_Ob = new WishListPage(driver);
		// Hover on Account And List text
		// click on Sign in button
		Login_Ob.ClickSignin();
		// Enter username and password, click on sign in Btn
		Login_Ob.Login("mravalekar@gmail.com", "MSR@!4!2");
		// Hover on Account And List text
		// click on your wish list
		Login_Ob.ClickYourWishList();
		// Create Wish List
		WishList_Ob.CreateWishList();
		// Search Product
		ProductPage_Ob.SearchProduct("Mobile");
		// Click on Prod Name
		ProductPage_Ob.SelectProduct();
		// Go to Prod Detail Page
		Login_Ob.RedirectToProdDetailPage();
		// Add product to wish list
		WishList_Ob.AddProducttoWishList();
	}
}
