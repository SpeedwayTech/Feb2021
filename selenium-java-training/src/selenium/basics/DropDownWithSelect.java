package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelect {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[@href='http://live.demoguru99.com/index.php/mobile.html']")).click();	
		//Handling dropdown
		WebElement dropdown_sortBy = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));	
		Select select = new Select(dropdown_sortBy);
		select.selectByIndex(2);
		Thread.sleep(5000);
		WebElement dropdown_show = driver.findElement(By.xpath("(//select[@title='Results per page'])[1]"));
		Select select1 = new Select(dropdown_show);
		select1.selectByVisibleText("36");
		select1.selectByValue("http://live.demoguru99.com/index.php/mobile.html?dir=asc&limit=24&order=name");
		
		
		
		
		
		
	}

}
