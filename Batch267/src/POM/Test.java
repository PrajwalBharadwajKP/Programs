package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(driver);
		l.setUsername();
		driver.navigate().refresh();
		Thread.sleep(3000);
		l.setUsername();
	}
}