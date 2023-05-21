package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nike.com/in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[text()='Nike Air Max Pre-Day SE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();

}
}
