package BrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}
}