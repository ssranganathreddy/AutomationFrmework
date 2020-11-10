package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webpage {

	public WebDriver driver;
	By sign_in = By.cssSelector("a[href*='sign_in']");
	
	By title = By.xpath("//*[@id='content']/div/div/h2");
		
	
	public webpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getlogin()
	{
		return driver.findElement(sign_in);
		
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
		
	}

}
