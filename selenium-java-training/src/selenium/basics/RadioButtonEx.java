package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("https://www.demoqa.com/automation-practice-form");	
		
		WebElement radioBtn_female = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		
		if(!radioBtn_female.isSelected()) {
			radioBtn_female.click();
		}
//Assignment: use driver.findElements here......
	}

}
