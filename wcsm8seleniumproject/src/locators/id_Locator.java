package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class id_Locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Documents/drop.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).click();
		
		driver.navigate().to("file:///C:/Users/HP/Documents/radioButtom.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click();
		driver.findElement(By.name("n2")).click();
		driver.findElement(By.name("n3")).click();
		driver.findElement(By.name("n4")).click();
		driver.navigate().to("https://msrtc.maharashtra.gov.in/");
		driver.findElement(By.id("from_txt")).sendKeys("pune");
		driver.findElement(By.id("to_txt")).sendKeys("mumbai");
		driver.findElement(By.id("submit")).click();
		
		

	}

}
