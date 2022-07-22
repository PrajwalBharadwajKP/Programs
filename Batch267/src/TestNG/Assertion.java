package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void fail() {
	  Reporter.log("hello",true);
	  Assert.fail();
	  Reporter.log("hai",true);
	}
}