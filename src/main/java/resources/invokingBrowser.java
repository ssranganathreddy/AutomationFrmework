package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class invokingBrowser {
	public WebDriver driver; //throwing as a global variable so that only once is initialized
	
	public Properties prop;
	public WebDriver browser() throws IOException {//if you need to invoke particular browser
		
		prop = new Properties(); // to invoke browser from properties file
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ranganath\\Documents\\fromscratch\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		//making which browser is selected
		
		if(browserName.equals("chrome")) //browserName==chrome //which gives a null pointer exception
		{
			//chrome
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranganath\\Documents\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(); //Object calling for chrome
		}
		else if(browserName.equals("EDGE"))
		{
			//Internet explorer
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ranganath\\Documents\\AUTOMATION\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
	}

	
	//public void getScreenshot() {
		
	//	TakesScreenshot ts = (TakesScreenshot) driver;
		
	//}
	
}
