package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends BaseClass{
	  @Test
	  public void f1() {
		  Reporter.log("test1",true);
	  }
}