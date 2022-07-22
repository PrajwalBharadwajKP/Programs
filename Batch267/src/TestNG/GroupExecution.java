package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution extends BaseClass{
	  @Test(groups={"smoke"})
	  public void registerUser() {
		  Reporter.log("user registered",true);
	  }
	  @Test(groups={"reg"})
	  public void loginUser() {
		  Reporter.log("user loggedin",true);
	  }
	  @Test
	  public void updateUser() {
		  Reporter.log("user updated",true);
	  }
	  @Test
	  public void deleteUser() {
		  Reporter.log("user deleted",true);
	  }
	  @Test(groups={"smoke"})
	  public void registerCust() {
		  Reporter.log("cust registered",true);
	  }
	  @Test(groups={"reg"})
	  public void loginCust() {
		  Reporter.log("cust loggedin",true);
	  }
	  @Test
	  public void updateCust() {
		  Reporter.log("cust updated",true);
	  }
	  @Test
	  public void deleteCust() {
		  Reporter.log("cust deleted",true);
	  }
}
