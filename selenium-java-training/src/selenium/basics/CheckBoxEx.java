package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("https://www.demoqa.com/automation-practice-form");	
		WebElement checkbox_sports = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		if(!checkbox_sports.isSelected()) {
			checkbox_sports.click();
		}
		System.out.println("***************************************************");	
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']//following::label"));		
		for(int i=0; i<checkBoxes.size(); i++) {
			if(checkBoxes.get(i).getText().equals("Music")) {
				checkBoxes.get(i).click();
				break;
			}
		}	
	}
}
