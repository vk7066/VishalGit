package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOvar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement jewllary = driver.findElement(By.xpath("a[text()='Watch Jewellery']"));
		Actions act=new Actions(driver);
		act.moveToElement(jewllary).perform();
		
		WebElement Gifts = driver.findElement(By.xpath("//span[text()='Gifts ']"));
		act.moveToElement(Gifts).perform();
		driver.findElement(By.xpath("//span[text()='Anniversary']")).click();
		
	}

}
