package BrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Block {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	}
}