package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize window
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> dropdownLists = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li/a/label"));
		
		for(int i=0; i<dropdownLists.size(); i++) {
			
			if(dropdownLists.get(i).getText().equals("Angular")) {
				dropdownLists.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
