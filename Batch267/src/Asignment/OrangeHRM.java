package Asignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM {
  @Test
  public void orangeHRM() {
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("firstName")).sendKeys("Rohit");
	  driver.findElement(By.id("middleName")).sendKeys("sharma");
	  driver.findElement(By.id("lastName")).sendKeys("A S");
	  WebElement id=driver.findElement(By.id("employeeId"));
	  id.clear();
	  id.sendKeys("4545");
	  driver.findElement(By.id("btnSave")).click();
	  driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	  driver.findElement(By.id("empsearch_id")).sendKeys("4545");
	  driver.findElement(By.id("searchBtn")).click();
	  WebElement verify = driver.findElement(By.xpath("//a[text()='Id']/../../../..//a[text()='4545']"));
	  if(verify.isDisplayed())
		  System.out.println("Employee added");
	  else {  
		  System.out.println("Employee not added");
		  Assert.fail();
	  }
	  driver.findElement(By.id("ohrmList_chkSelectAll")).click();
	  driver.findElement(By.id("btnDelete")).click();
	  driver.findElement(By.id("dialogDeleteBtn")).click();
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  driver.close();
  }
}