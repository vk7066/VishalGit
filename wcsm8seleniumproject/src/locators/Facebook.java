package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("vksfh");
		driver.findElement(By.id("pass")).sendKeys("vishal454");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
		
	}

}
