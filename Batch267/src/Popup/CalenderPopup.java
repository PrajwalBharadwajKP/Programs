package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abhibus.com");
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-month='6']//a[text()='14']")).click();
		driver.findElement(By.id("datepicker2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-month='7']//a[text()='24']")).click();
	}
}