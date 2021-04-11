package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrahAndDropEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();		
		WebElement btn_source = driver.findElement(By.id("draggable"));	
		WebElement btn_target = driver.findElement(By.id("droppable"));		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(btn_source, btn_target).perform();
//		actions.moveToElement(btn_source).clickAndHold().moveToElement(btn_target).release().perform();
		
		if(btn_target.getText().equals("Dropped!")) {
			System.out.println("Drag and drop action is performed");
		} else {
			System.out.println("Drag and drop action is not performed");
		}
	}
}
