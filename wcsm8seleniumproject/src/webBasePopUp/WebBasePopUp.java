package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasePopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Generate alert popUp
		driver.get("file:///C:/Users/HP/Desktop/selenium%20notes/pop.html");
		driver.findElement(By.xpath("//button[.='Click me']")).click();
		Thread.sleep(2000);
		
		//To handle alert
	    Alert a1 = driver.switchTo().alert();
	    a1.accept();
	    
	    
	}

}
