import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Puma_comScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait exlicitwait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://in.puma.com/in/en");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshots/pumahomepage.png");
		Files.copy(src, destination);
		
        driver.findElement(By.xpath("//div[text()='Search']/ancestor::div[@class='flex items-center gap-2 ml-5']")).click();
        driver.findElement(By.xpath("//span[text()='RS-X³ Wh Unisex Sneakers']")).click();
		
		
		
       
		
		
	}

}
