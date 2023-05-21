package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/selenium%20notes/frame.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		username.sendKeys("admin");
		
		driver.switchTo().frame("frname");
		WebElement password = driver.findElement(By.id("i2"));
		password.sendKeys("manager");
		
		//To clear the boxes
		Thread.sleep(2000);
		password.clear();
		driver.switchTo().parentFrame();
	    username.clear();
		
		
	     
		
		
	}
	

}
