package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("7066171419");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Vishal@250");
		//By using css Selector
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		
	//  By using xpath mathod	
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
