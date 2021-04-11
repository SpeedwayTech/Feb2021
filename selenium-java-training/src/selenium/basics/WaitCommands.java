package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window		
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);  //pageLoadTimeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicitly wait
		WebElement textBox_emailId = driver.findElement(By.id("email"));
		textBox_emailId.sendKeys("janardhankaragir@gmail.com");		
		Thread.sleep(1000);
		WebElement textBox_password = driver.findElement(By.name("login[password]"));
		textBox_password.sendKeys("Password@12");	
		WebDriverWait wait = new WebDriverWait(driver, 20);  //explicit wait
		WebElement btn_login = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("send2"))));
		btn_login.click();
//		((JavascriptExecutor) driver).executeScript("return document.readyState");	
		driver.findElement(By.xpath("//a[@href='http://live.demoguru99.com/index.php/mobile.html']")).click();	
		//Handling dropdown
		WebElement dropdown_sortBy = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));	
		Select select = new Select(dropdown_sortBy);
		select.selectByIndex(2);
		driver.close();
	}

}
