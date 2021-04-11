package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventUsingActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement txtBox_firstName = driver.findElement(By.id("firstName"));		
		Actions actions = new Actions(driver);	
		actions.keyDown(txtBox_firstName, Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();
		driver.close();
	}
}
