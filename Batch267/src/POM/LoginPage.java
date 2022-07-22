package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	@FindBy(id="username")
	private WebElement unTB;
	public LoginPage(WebDriver driver) {	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setUsername() {
		unTB.sendKeys("admin");
	}
}