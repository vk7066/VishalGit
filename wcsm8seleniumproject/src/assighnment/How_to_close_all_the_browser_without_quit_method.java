package assighnment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_close_all_the_browser_without_quit_method {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
	
	    driver.findElement(By.linkText("Open a popup window")).click();
	    
	    //close all the browser without using quit()
	    Set<String> allhandles = driver.getWindowHandles();
	    
	    for(String wh:allhandles)
	    {
	    	Thread.sleep(2000);
	    	driver.switchTo().window(wh).close();
	    }
	}

}
