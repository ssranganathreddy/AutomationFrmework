package completeautomation.fromscratch;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.loginpage;
import pageObjects.webpage;
import resources.invokingBrowser;

public class Homepage extends invokingBrowser {
	
	/*@BeforeTest()
	public void initialize() throws IOException
	{
		 driver = browser();
		 driver.get("http://www.qaclickacademy.com/");
	}
	*/
	
	@Test(dataProvider = "getData")
	
	public void pageNavigation(String Email, String Password) throws IOException, InterruptedException
	{
		driver = browser();
		 driver.get("http://www.qaclickacademy.com/");
	//one is creating method from the class webpage
	 // 2nd is inheritance
	 webpage w = new webpage(driver);
	 w.getlogin().click();//this is similar to driver.findElement.by.cssselector......
	 
	 loginpage lp = new loginpage(driver);
	 lp.getEmail().sendKeys(Email);
	 lp.getPassword().sendKeys(Password);
	 lp.getLogin().click();

	}
	
	@DataProvider
	
	public Object[][] getData() {
		Object[][] data= new Object[1][2];
				
		data[0][0]="abcdefgh";
		data[0][1]="12345678";
		//data[0][2]="";
		return data;
		
	}
	
	@AfterTest()
	public void teardown()
	{
		driver.close();
	}
	
	
	
	

}
