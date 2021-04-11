package testng.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	WebDriver driver;

	@DataProvider
	public Object[][] getTestData() {
		return new Object[][] { { "janardhankaragir@gmail.com", "Password@12" }, { "admin@gmail.com", "admin" } };
	}

	// data driven testing
	@Test(dataProvider = "getTestData")
	public void loginTest(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("login[password]")).sendKeys(password);
		driver.findElement(By.id("send2")).click();
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	public void close() {
		driver.close();
	}
}
