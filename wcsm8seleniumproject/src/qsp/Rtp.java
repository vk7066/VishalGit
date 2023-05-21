package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println ("select the browser which you want to open");
		String BrowserValue=sc.next();
		
		if (BrowserValue.equalsIgnoreCase("chrome")) {
			//TO Avoid IlleagleStateException
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			//To Avoid ConnectionFailedException
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins*=");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();//To maximize browser
			Thread.sleep(2000);//to stop exicution of script  for 2seconds
			driver.close();// TO close the browser
			
		}
		
		else if (BrowserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			driver.close();
			
			
		}
		
		
		
	}
	
    
	

}
