package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
  @Parameters({"Browser"})
	@Test
  public void compatability(String browser) {
	  WebDriver driver;
	  if(browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else {
		  System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
	  driver.get("https://demo.actitime.com/login.do");
  }
}