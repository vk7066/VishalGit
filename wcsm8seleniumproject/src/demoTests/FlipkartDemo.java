package demoTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Hp laptops uner 50000");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	    WebElement hp1 = driver.findElement(By.xpath("//div[@class='_4rR01T' and text()='HP Laptop Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq2717TU Thin and Light Laptop']"));
	    hp1.click();
	    System.out.println( hp1.getText());
	    
	    
	    
	
	
        

}
}









