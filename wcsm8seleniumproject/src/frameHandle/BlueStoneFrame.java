package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		
		Thread.sleep(2000);
		//Switch the control to frame or click on chat box
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		//driver.switchTo().frame(frameElement);
		
		driver.switchTo().frame("fc_widget");//By using name or id
		
		
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		
		//switch the controls to default webpage
//		driver.switchTo().parentFrame();//To switch the controls to parent webpage of current webpage
		driver.switchTo().defaultContent();//To switch the controls to default webpage
		
		
		//insert the inputs for textBox
		driver.findElement(By.id("chat-fc-name")).sendKeys("vk@123");
		driver.findElement(By.id("chat-fc-email")).sendKeys("vkbrand12@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9012121287");
		
		
		
		
		
		
	}

}
