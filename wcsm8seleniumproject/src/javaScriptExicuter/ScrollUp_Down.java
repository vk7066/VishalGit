package javaScriptExicuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		//To perform Scrolling Operations
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//scroll Down>>>>
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		//scroll Up>>>>>>
		jse.executeScript("window.scrollBy(0,-350)");
		
	}

}
