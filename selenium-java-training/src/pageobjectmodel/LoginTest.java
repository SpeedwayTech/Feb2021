package pageobjectmodel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	LoginPage loginpage;

	@BeforeMethod
	public void initialization() {
		init();
		loginpage = new LoginPage(driver);
	}

	@Test
	public void loginSuccessTest() {		
		loginpage.login();
	}

	@Test
	public void loginFailureTest() {
		loginpage.login();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
