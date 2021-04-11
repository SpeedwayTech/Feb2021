package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");	
	}

}
