package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Object {
	@DataProvider
	public Object[] getData() {
		Object[] user = {"hello",1,true,'a'};
		return user;
	}
	@Test(dataProvider="getData")
	  public void registerUser(Object un) {
		  Reporter.log("user registered: "+un,true);
	  }
}