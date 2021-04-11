package selenium.basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window		
		driver.get("https://www.demoqa.com/browser-windows");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window Handle is: "+parentWindowHandle);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		
		for(String handle : windowHandles) {
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);	
				System.out.println(driver.getCurrentUrl());
				break;
			}			
		}	
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());	
		driver.quit();
	}
}
