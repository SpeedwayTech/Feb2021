package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("http://live.demoguru99.com/index.php/");
		String title = driver.getTitle();
		System.out.println("title is: "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: "+currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println("page source is: "+pageSource);
		
		driver.close();
		driver.quit(); //you can use this is in switch to window concept
	}
}
