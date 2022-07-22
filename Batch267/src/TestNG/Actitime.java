package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actitime {
	final String a="https://demo.actitime.com/login.do";
	@Parameters({"appURL"})	
	@Test
	public void Test3(@Optional(a)String url) {
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
  }
}