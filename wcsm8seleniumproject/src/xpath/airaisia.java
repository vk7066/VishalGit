package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class airaisia {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airasia.co.in/home");
	    Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).sendKeys("BLR");
		Thread.sleep(2000);
	 //    driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).sendKeys("BLR");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Special Fares')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath( "//img[@alt='plus' and (@id='student')]")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Thu, Apr 13']")).click();
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		
	}

}
 					 