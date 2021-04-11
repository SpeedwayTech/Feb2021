package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");		
		WebElement textBox_emailId = driver.findElement(By.id("email"));
		textBox_emailId.sendKeys("janardhankaragir@gmail.com");		
		WebElement textBox_password = driver.findElement(By.name("login[password]"));
		textBox_password.sendKeys("Password@12");	
		WebElement btn_login = driver.findElement(By.id("send2"));
		btn_login.click();	
				
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.partialLinkText("Bac")).click();
	}
	//Ctrl+Shift+o  shortcut to import
}
