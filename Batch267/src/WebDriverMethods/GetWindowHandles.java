package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		System.out.println();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> allWH = driver.getWindowHandles();
		for(String w: allWH) {
			System.out.println(w);
		}
	}
}