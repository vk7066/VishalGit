package assighnment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionandRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement watchJewellary1 = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(watchJewellary1).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		WebElement filterBy = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Thread.sleep(3000);
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(filterBy).perform();
		}
		Robot robot=new Robot();
		
		//for copying 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	    driver.findElement(By.name("search_query")).click();
		
		//for pasting
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.name("submit_search")).submit();
	}

}
