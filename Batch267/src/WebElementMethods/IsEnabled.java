package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		WebElement loginBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginBTN.isEnabled());
		//System.out.println(loginBTN.isDisplayed());
	}

}
