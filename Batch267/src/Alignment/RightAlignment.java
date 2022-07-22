package Alignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		int username_x = username.getRect().x;
		int password_x = password.getRect().x;
		int username_width = username.getRect().width;
		int password_width = password.getRect().width;
		if((username_x+username_width)==(password_x+password_width)) {
			System.out.println("Right aligned");
		}
		else {
			System.out.println("Not Right Aligned");
		}
	}
}