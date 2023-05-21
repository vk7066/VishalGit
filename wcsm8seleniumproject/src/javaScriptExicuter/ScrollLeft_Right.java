package javaScriptExicuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft_Right {
	public static void main(String[] args) throws InterruptedException {
		//Scrolling Operations
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//TO scroll left
		jse.executeScript("window.scrollBy(-10000,0)");
		
		//To scroll right
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(10000,0)" );
		
		
		
		
	}

}
