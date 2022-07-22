package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//a[text()='API Docs'])[3]")).click();
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		WebElement frame1 = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//a[contains(text(),'chromium')]")).click();
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.className("interfaceName")).click();
		driver.switchTo().defaultContent();
	}
}