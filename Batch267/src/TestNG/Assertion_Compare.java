package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_Compare {
  @Test
  public void compare() {
	  String a="abc";
	  String b="bc";
	  Assert.assertEquals(a, b);
	  Reporter.log("hello",true);
  }
}
