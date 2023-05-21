package methods_of_webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Point point = link.getLocation();
		int x=point.getX();
		int y=point.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+(y-250)+")");
		Thread.sleep(2000);
		//handle or address of current window /parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println("Handle of Parent window :"+parentHandle);
		
		//click on link and child  window
		link.click();
		
		//Handle or address of all windows
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh : allHandles)
		{
			System.out.println(wh);
		}
		
		
		
		
	}

}
