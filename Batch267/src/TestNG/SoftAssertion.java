package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
  @Test
  public void soft() {
	  String a="abc";
	  String b="abc";
	  SoftAssert asert=new SoftAssert();  
	  asert.assertEquals(a, b);
	  Reporter.log("hello",true);
	  asert.assertAll();
  }
}