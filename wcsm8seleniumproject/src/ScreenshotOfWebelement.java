import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenshotOfWebelement {
	public static void main(String[] args) throws IOException {
		 System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
	        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        
	        WebElement imgsrc = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/128/128/image/0ff199d1bd27eb98.png?q=100']"));
	        File src=imgsrc.getScreenshotAs(OutputType.FILE);
	        File dest=new File("./screenshots/monitors.png");
	        Files.copy(src, dest);
	        
	        
	}

}
