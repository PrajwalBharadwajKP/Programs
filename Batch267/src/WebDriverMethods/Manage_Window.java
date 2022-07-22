package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		Point p=new Point(10,10);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		Dimension d=new Dimension(100,100);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}
}