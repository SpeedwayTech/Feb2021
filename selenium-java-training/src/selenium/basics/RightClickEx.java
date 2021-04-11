package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement btn_rightClick = driver.findElement(By.id("rightClickBtn"));		
		Actions actions = new Actions(driver);
		actions.contextClick(btn_rightClick).perform();		
		WebElement message_rightClick = driver.findElement(By.id("rightClickMessage"));
		
		if(message_rightClick.getText().equals("You have done a right click")) {
			System.out.println("Right click action is performed");
		} else {
			System.out.println("Right click action is not performed");
		}
	}
}
