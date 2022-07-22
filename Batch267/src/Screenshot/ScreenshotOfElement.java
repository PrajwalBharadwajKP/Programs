package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfElement {
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		String time = date.toString().replace(":","-");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement img = driver.findElement(By.id("username"));
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+time+".png");
		FileHandler.copy(src, dest);
	}
}