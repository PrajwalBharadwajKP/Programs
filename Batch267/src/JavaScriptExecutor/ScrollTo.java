package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=1;i<=10;i++) {
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		}
	}
}