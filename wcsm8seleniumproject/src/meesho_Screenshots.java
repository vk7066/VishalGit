import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class meesho_Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		WebElement WomenWestern = driver.findElement(By.xpath("//span[text()='Women Western']"));
		act.moveToElement(WomenWestern).perform();
		driver.findElement(By.linkText("Jeans")).click();
		
		
		//driver.findElement(By.xpath("//p[text()='Tinkle Stylus Girls Jeans & Jeggings']")).click();
		
		WebElement product1 =driver.findElement(By.xpath("//img[@src='https://images.meesho.com/images/products/61764358/tidml_512.jpg']"));
		TakesScreenshot ts=(TakesScreenshot)driver;
			
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/meeshojeans.png");
		Files.copy(src, dest);
		
		
		
		

		
		
		
		
		 
	}

}
