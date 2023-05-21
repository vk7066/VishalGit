package take_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ipltablesc {
	public static void main(String[] args) throws IOException {
		//div[@class='oajNTd imso-hide-loading']/ancestor::div[@class='tb_u attn']
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/search?q=ipl+table+point&rlz=1C1ONGR_enIN1021IN1021&oq=&aqs=chrome.0.35i39i362l8.847087836j0j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11q99yy05p;5;/m/03b_lm1;st;fp;1;;;");
		WebElement table = driver.findElement(By.xpath("//div[@class='oajNTd imso-hide-loading']/ancestor::div[@class='tb_u attn']"));
		File src = table.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/table.png");
	    Files.copy(src, dest);
		
		
	}

}
