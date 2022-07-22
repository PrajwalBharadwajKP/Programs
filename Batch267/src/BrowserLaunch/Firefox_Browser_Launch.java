package BrowserLaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}
}