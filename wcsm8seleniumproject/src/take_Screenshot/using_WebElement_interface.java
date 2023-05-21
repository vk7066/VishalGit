package take_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class using_WebElement_interface {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chorome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		WebElement img = driver.findElement(By.xpath("//img[@alt='how-to-earn-video-thumbnail']"));
		
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/homepageimg.png");
		
		Files.copy(src, dest);
		
		
	}

}
