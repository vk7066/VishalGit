package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Delhi, Indira Gandhi International Airport, DEL, India, IN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='_depdateeu1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='22']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='_retdateeu1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='16']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='ddladult1' ]")).click();
		driver.findElement(By.xpath("//option[@value='3' ]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='ddlchildren1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='concessionaryType1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='ArmedForce']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}

}
