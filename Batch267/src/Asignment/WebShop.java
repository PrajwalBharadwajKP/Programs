package Asignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement element:allElements) {
			element.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.className("close")).click();
		driver.findElement(By.className("ico-cart")).click();
		WebElement textbox1 = driver.findElement(By.xpath("//table[@class='cart']//a[text()='Fiction']/../..//input[@class='qty-input']"));
		textbox1.clear();
		textbox1.sendKeys("10");
		driver.findElement(By.name("updatecart")).click();
		String value = driver.findElement(By.xpath("//table[@class='cart']//a[text()='Fiction']/../..//span[@class='product-subtotal']")).getText();
		if(value.equals("240.00"))
			System.out.println("Updated cart");
		else
			System.out.println("Not updated cart");
		driver.close();
	}
}