package Asignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		String expected_Title="actiTIME - Enter Time-Track";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement logout_Link = driver.findElement(By.id("logoutLink"));
		wait.until(ExpectedConditions.visibilityOf(logout_Link));
		String actualT_itle = driver.getTitle();
		if(actualT_itle.equals(expected_Title)) 
			System.out.println("Homepage Displayed");
		else
			System.out.println("Homepage not Displayed");
		logout_Link.click();
		driver.close();
	}
}