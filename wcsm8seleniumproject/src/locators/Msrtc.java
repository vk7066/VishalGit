package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Msrtc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://msrtc.maharashtra.gov.in/");
		driver.findElement(By.id("from_txt")).sendKeys("pune");
		driver.findElement(By.id("to_txt")).sendKeys("mumbai");
		driver.findElement(By.id("journeydate")).click();
		driver.findElement(By.id("submit")).click();
		
	}

}
