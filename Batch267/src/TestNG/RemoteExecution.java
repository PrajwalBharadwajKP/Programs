package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	@Test
	public void f() throws MalformedURLException {
		URL url=new URL("192.168");
		DesiredCapabilities browser =new DesiredCapabilities();
		browser.setBrowserName("chrome");
		browser.setVersion("100");
		WebDriver driver=new RemoteWebDriver(url, browser);
		driver.get("https://demo.actitime.com/login.do");
	}
}