package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreConditionsAndPostConditions {
  @Test(priority=1)
  public void updateUser() {
	  Reporter.log("user updated",true);
  }
  @Test(priority=2)
  public void deleteUser() {
	  Reporter.log("user deleted",true);
  }
  @BeforeMethod
  public void login() {
	  Reporter.log("login",true);
  }
  @AfterMethod
  public void logout() {
	  Reporter.log("logout",true);
  }
}