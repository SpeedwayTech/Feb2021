package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")     //driver.findElement(By.id("email"));
	WebElement txtBox_emailAddress;
	
	@FindBy(name="login[password]")
	WebElement txtBox_password;
	
	@FindBy(xpath="//button[@id='send2']")
	WebElement btn_login;
	
	public void login() {
		txtBox_emailAddress.sendKeys("janardhankaragir@gmail.com");
		txtBox_password.sendKeys("Password@12");
		btn_login.click();
	}
}
