package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount =3)
	  public void registerUser() {
		  Reporter.log("user registered",true);
	  }
}