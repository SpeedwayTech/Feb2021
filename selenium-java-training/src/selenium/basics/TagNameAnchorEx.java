package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAnchorEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("https://www.google.com/");
//		System.out.println(driver.findElement(By.tagName("a")).getText());
		
		List<WebElement> googleLinks = driver.findElements(By.tagName("a"));
		for(int i=0; i<googleLinks.size(); i++) {
			String link = googleLinks.get(i).getText();
			System.out.println("Google links are: "+link);
		}
	}
}
