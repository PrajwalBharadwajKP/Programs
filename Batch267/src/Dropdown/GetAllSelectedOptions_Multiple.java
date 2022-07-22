package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions_Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement games = driver.findElement(By.id("games"));
		Select select=new Select(games);
		Thread.sleep(3000);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);
		List<WebElement> all_Selected_Options = select.getAllSelectedOptions();
		for(WebElement option: all_Selected_Options) {
			System.out.println(option.getText());
		}
	}
}