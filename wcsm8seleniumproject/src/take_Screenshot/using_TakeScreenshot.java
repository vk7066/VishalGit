package take_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.netty.channel.socket.ChannelInputShutdownReadComplete;

public class using_TakeScreenshot {
	
	//Way no.5 of taking Screenshot
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
		driver.get("https://www.selenium.dev/ecosystem/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//Implimentations of method
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/ss1.png");//giving name to the file
		
        Files.copy(src, dest);
	}

}
