package javaScriptExicuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollTillPerticulerWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
	
		WebElement contactus = driver.findElement(By.xpath("//a[.='Contact Us']"));
		
	    Point point = contactus.getLocation();
	   int xaxis= point.getX();
	   int yaxis=point.getY();
	   System.out.println(xaxis);
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	  contactus.click();
	  
	  
	  
	   
	}

}
