package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneSite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		//create object of actions class to move to the coin
		Actions act=new Actions(driver);
		//use moveToElement method to move
		act.moveToElement(coins).perform();
		
		driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		if(coin.isDisplayed())
		{
			System.out.println("coin is displayed");
		}
		else
		{
			System.out.println("will get exception");
		}
	}

}
