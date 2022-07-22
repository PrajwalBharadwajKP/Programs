package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//img[@alt='Redmi Note 10T 5G (Chromium White 4GB RAM, 64GB Storage) | Dual 5G | 90Hz Adaptive Refresh Rate | MediaTek Dimensity 700 7...']")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String w: allWh) {
			driver.switchTo().window(w);
			Thread.sleep(3000);
		}
		driver.close();
	}
}