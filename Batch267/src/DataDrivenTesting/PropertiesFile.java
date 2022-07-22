package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PropertiesFile {
	@Test
	public void readDataFromPropertyFile() throws IOException {
		Properties properties =new Properties();
		FileInputStream fis=new FileInputStream("./config.properties");
		properties.load(fis);
		Reporter.log(properties.getProperty("url"),true);
		Reporter.log(properties.getProperty("name"),true);
		Reporter.log(properties.getProperty("job"));
		System.out.println(properties.getProperty("residence"));	
	}
}