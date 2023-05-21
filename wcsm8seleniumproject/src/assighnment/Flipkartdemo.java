package assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,10000)");
		driver.findElement(By.xpath("//a[.='Contact Us']")).click();
		WebElement Aboutus = driver.findElement(By.xpath("//div[@class='_1EQH8l']"));
		if(Aboutus.isDisplayed())
		{
		System.out.println("Test1 Pass");
		}
		else
		{
		System.out.println("Test fail");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Careers']")).click();
		WebElement Careers = driver.findElement(By.xpath("//section[@class='fk-banner']"));
		if(Careers.isDisplayed())
		{
		System.out.println("Test2 pass");
		}
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Flipkart Stories']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Press']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[.='Flipkart Wholesale']")).click();
		driver.navigate().back();
		
		
		
		
		
	}

}
