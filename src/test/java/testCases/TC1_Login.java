package testCases;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageFactory.LoginPage;
import pageFactory.ProductPage;

public class TC1_Login extends BaseClass {
        @Test
	public void Login() throws InterruptedException {
                LoginPage Login_Ob = new LoginPage(driver);
		// Hover on Account And List text
		// click on Sign in button
		Login_Ob.ClickSignin();
		// Enter username and password, click on sign in Btn
                Login_Ob.Login("11223344", "aabbccdd");
		// Verify user is loggedin on not
		Login_Ob.VerifyUserLogin();
                // Logout
		Login_Ob.Signout();
	}}
