package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass {
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  Reporter.log("before method",true);
  }
  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  Reporter.log("after method",true);
  }
  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  Reporter.log("before class",true);
  }
  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  Reporter.log("after class",true);
  }
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  Reporter.log("before test",true);
  }
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  Reporter.log("after test",true);
  }
  @BeforeSuite(alwaysRun=true)
  public void beforeSuite() {
	  Reporter.log("before suite",true);
  }
  @AfterSuite(alwaysRun=true)
  public void afterSuite() {
	  Reporter.log("after suite",true);
  }
}