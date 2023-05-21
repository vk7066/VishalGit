package take_Screenshot;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class EvenFiringtWebDriver {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chorome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
	    File src = efw.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screeshots/meesho.png");
	    
	    Files.copy(src, dest);
	}

}
