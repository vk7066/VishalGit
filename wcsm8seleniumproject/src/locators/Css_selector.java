package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		driver.findElement(By.name("emailId")).sendKeys("vk@555");
		driver.findElement(By.name("password")).sendKeys("vk@555");
		driver.findElement(By.cssSelector("button[class='primary-btn']")).click();
		driver.quit();
		 
	}

}
