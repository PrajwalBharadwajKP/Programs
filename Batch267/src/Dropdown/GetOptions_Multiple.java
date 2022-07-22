package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement beverage = driver.findElement(By.id("beverages"));
		Select select=new Select(beverage);
		List<WebElement> all_Options = select.getOptions();
		for(WebElement option: all_Options) {
			System.out.println(option.getText());
		}
	}
}