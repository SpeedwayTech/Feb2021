package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("http://live.demoguru99.com/index.php/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());	
		driver.navigate().forward();
		driver.navigate().refresh();	
		System.out.println(driver.getTitle());	
	}
}
