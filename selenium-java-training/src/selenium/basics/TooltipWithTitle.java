package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipWithTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jordan\\Documents\\Selenium training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php/");
		driver.manage().window().maximize();		
		WebElement link_paypal = driver.findElement(By.xpath("//img[contains(@src, 'paypalobjects')]"));
		String txt_additional = link_paypal.getAttribute("title");
		if(txt_additional.equals("Additional Options")) {
			System.out.println("tooltip is matching");
		} else {
			System.out.println("tooltip is not matching");
		}

	}

}
