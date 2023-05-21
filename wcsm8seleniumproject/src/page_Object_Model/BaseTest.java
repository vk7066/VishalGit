package page_Object_Model;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
	static WebDriver driver;
	
	public void setUp() throws IOException//Open Browser
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		 if(browserValue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty(CHROME_KEY, CHROME_PATH);
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get(url);
		 }
		 else if(browserValue.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty(GECKO_KEY, GECKO_PATH);
			    driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get(url);
			 
		 }
		 else
		 {
			 System.out.println("invalid browser value");
		 }
	}
	
	    
	   public void scroll()//For scrolling operations
       {
         JavascriptExecutor jse=(JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,500)");
       }
	  
	   public void acceptalert()//To handle the alert
	   {
		  driver.switchTo().alert().accept();
	   }
		 
	   public void tearDown()//To close the browser
	   {
			 driver.close();
	   }
		 
		
}



