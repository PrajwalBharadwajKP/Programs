package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintMessageInBothConsoleAndReport {
	@Test
	public void consoleAndReport() {
		Reporter.log("welcome to selenium class",true);
	}
}