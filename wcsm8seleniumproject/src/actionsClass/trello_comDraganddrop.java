package actionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class trello_comDraganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("vkbrand7066@gmail.com");
		driver.findElement(By.id("login")).click();
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vishal@1419");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'DD3DlImSMT6fgc XQSLFE3ZZrvms3') and text()='Boards']")));
		driver.findElement(By.xpath("//span[contains(@class,'DD3DlImSMT6fgc XQSLFE3ZZrvms3') and text()='Boards']")).click();
		driver.findElement(By.xpath("//div[text()='java']")).click();
		Thread.sleep(2000); 
		
		WebElement literalssrc = driver.findElement(By.xpath("//span[text()='literals']"));
		WebElement oopssrc=driver.findElement(By.xpath("//span[text()='oops']"));
		WebElement interfacesrc=driver.findElement(By.xpath("//span[text()='interface']"));
		WebElement donesrc = driver.findElement(By.xpath("(//span[@class='icon-sm icon-add'])[2]"));
		WebElement keywordsrc = driver.findElement(By.xpath("//span[text()='keywords'"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		
		act.dragAndDrop(oopssrc, donesrc).build().perform();
		act.dragAndDrop(interfacesrc, donesrc).perform();
		act.dragAndDrop(literalssrc, donesrc).perform();
		act.dragAndDrop(donesrc, keywordsrc).perform();
		
		
		
		
		
		
	}

}
