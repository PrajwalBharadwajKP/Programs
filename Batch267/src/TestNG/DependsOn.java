package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
  @Test(priority=2)
  public void registerUser() {
	  Reporter.log("user registered",true);
  }
  @Test(priority=1,dependsOnMethods = "registerUser")
  public void loginUser(){
	  Reporter.log("user loggedin",true);
  }
}