package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class adidasLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.adidas.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='sign up ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='registration-firstname-field']")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@id='registration-lastname-field']")).sendKeys("kumbhar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@id='registration-email-field']")).sendKeys("vkbrand7066@gmail.com");
		driver.findElement(By.xpath("//input[@id='registration-password-field']")).sendKeys("Vishal@70");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
	    /*driver.findElement(By.xpath("//a[text()='log in ']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("vkbrand7066@gmail.com");
	    driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("vishal222");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Log in']")).click();
	    Thread.sleep(5000);
	    driver.close();*/
	    System.out.println("operation Completed...!");       
	}

}
