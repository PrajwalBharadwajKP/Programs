package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(8000);
		driver.close();
	}
}