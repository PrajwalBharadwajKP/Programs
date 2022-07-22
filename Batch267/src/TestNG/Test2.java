package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 extends BaseClass{
	  @Test
	  public void f2() {
		  Reporter.log("test2",true);
	  }
}