package qsp;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Launch_ChromeBrowser {
        public static void main(String[] args) throws InterruptedException
        {
        //To avoid IlleagleStateException
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	
    	//To avoid ConnectionFailedException
	   /* ChromeOptions co = new ChromeOptions();
	    
	    co.addArguments("--remote-allow-origins=*");*/
    	ChromeDriver driver =new ChromeDriver();
    	
    
    	
    	Thread.sleep(4000);//To stop Exicution of Script for 4 seconds
    	
    	//To close the Chrome Browser
    	driver.close();
    	
        }
 

}


