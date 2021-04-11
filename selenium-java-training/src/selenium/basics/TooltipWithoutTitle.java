package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipWithoutTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/tool-tips/");
		driver.manage().window().maximize();	
		WebElement btn_tooltip = driver.findElement(By.id("toolTipButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btn_tooltip).perform();
		WebElement txt_tooltip = driver.findElement(By.xpath("//*[text()='You hovered over the Button']"));
		Thread.sleep(3000);
		if(txt_tooltip.equals("You hovered over the Button")) {
			System.out.println("tooltip is matching");
		} else {
			System.out.println("tooltip is not matching");
		}
	}
}
