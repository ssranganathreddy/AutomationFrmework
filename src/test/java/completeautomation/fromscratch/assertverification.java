package completeautomation.fromscratch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.webpage;
import resources.invokingBrowser;

public class assertverification extends invokingBrowser {
	
	@BeforeTest()
	public void initialize() throws IOException
	{
		 driver = browser();
		 driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test()
	
	public void pageNavigation() throws IOException
	{
	//one is creating method from the class webpage
	 // 2nd is inheritance
	 webpage w = new webpage(driver);
	 Assert.assertEquals(w.gettitle().getText(), "FEATURED COURSES");
	}
	
	
	@AfterTest()
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	

}
