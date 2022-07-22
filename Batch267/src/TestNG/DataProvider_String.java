package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_String {
	@DataProvider
	public String[] getData() {
		String[] user = {"hello","1","true","a"};
		return user;
	}
	@Test(dataProvider="getData")
	  public void registerUser(String un) {
		  Reporter.log("user registered: "+un,true);
	  }
}