package BrowserLaunch;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	}
}