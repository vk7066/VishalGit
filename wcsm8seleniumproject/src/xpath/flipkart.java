package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Travel' and (@class='xtXmba')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='0-departcity']")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Mumbai, BOM - Chatrapati Shivaji Airport, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']")).sendKeys("hyd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Hyderabad, HYD - Rajiv Gandhi International, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Depart On']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'jkj0H4' )and text()='12']")).click();
	}

}
