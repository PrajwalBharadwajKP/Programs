package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement user=(driver.findElement(By.id("username")));
		System.out.println(user.getRect().height);
		System.out.println(user.getRect().width);
		System.out.println(user.getRect().x);
		System.out.println(user.getRect().y);
		System.out.println(user.getRect().getHeight());
		System.out.println(user.getRect().getWidth());
		System.out.println(user.getRect().getX());
		System.out.println(user.getRect().getY());
	}
}