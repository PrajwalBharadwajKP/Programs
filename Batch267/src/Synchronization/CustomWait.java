package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		for(int i=1; i<=100;i++) {
			try {
				driver.findElement(By.name("username")).sendKeys("admin");
				break;
			}
			catch(Exception e) {
			}
		}
	}
}