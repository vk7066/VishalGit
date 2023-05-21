package qsp;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class realianceIndia {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
	    Thread.sleep(5000);		
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement computers = driver.findElement(By.xpath("//div[text()='Computers']"));
		Actions act= new Actions(driver);//for mouse over action we need to create object for action class and pass the ref. 
		act.moveToElement(computers).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Student Laptops")).click();
		
		driver.findElement(By.xpath("//div[text()='Lenovo']")).click();
		driver.findElement(By.xpath("//div[text()='Dell']")).click();
		driver.findElement(By.xpath("//h4[text()='Laptop Type']")).click();
	    
		
		
	} 

}
