package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTest {
  @Test(priority=1)
  public void registerUser() {
	  Reporter.log("user registered",true);
  }
  @Test(priority=2)
  public void loginUser() {
	  Reporter.log("user loggedin",true);
  }
  @Test(priority=3)
  public void updateUser() {
	  Reporter.log("user updated",true);
  }
  @Test(priority=4)
  public void deleteUser() {
	  Reporter.log("user deleted",true);
  }
}