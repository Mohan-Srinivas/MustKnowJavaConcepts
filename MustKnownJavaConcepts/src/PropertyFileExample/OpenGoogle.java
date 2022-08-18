package PropertyFileExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		
		FileInputStream Fis=new FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(Fis);
		
		String browser=properties.getProperty("BrowserName");
		String driverLoc=properties.getProperty("DriverLocation");
		
		// Open ChromeBroser
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driverLoc);
			driver=new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("fireFox")) 
		{
			System.setProperty("webdriver.gecko.driver", driverLoc);
			driver=new FirefoxDriver();
		}
		driver.get("https://google.co.in");
		//Find the Google Search Bar and Enter Trichy
		driver.findElement(By.name("q")).sendKeys("Trichy"+Keys.ENTER);
		String tit=driver.getTitle();
		System.out.println("Title of the page : "+tit);
	
		
		
		
		
		//driver.quit();
		
	}
}
