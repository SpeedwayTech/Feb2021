package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
		
	public void main(String[] args) {	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("http://live.demoguru99.com/index.php/");
			System.out.println();		
	}
}
