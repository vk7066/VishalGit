package take_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class using_RemoteWebDriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chorome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
	    System.setProperty("webdriver.chorome.driver", "./drivers/chromedriver.exe");
		
	    RemoteWebDriver rwd=new ChromeDriver();
	    File src = rwd.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./screeshots/meesho2.png");//setting path for screenshot file
	    
	    Files.copy(src, dest);
	}

}
