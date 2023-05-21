package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/selenium%20notes/confirmationPopup.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		
	   
	    System.out.println(a1.getText());
	}

}
