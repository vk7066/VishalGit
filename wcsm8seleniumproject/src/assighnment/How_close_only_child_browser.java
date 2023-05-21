package assighnment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_close_only_child_browser {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
	
	    WebElement link = driver.findElement(By.linkText("Open a popup window"));
	    
	   //Handle or address of parent window
	    String parenthandle = driver.getWindowHandle();
	    
	    //click on link to get child window
	    link.click();
	    Thread.sleep(2000);
	    //To close only child browser
	    
	    //handle all the windows
	    Set<String> allHandles = driver.getWindowHandles();
	    
	    //to close only child browser
	    for (String wh:allHandles)
	    {
	    	if(parenthandle.equals(wh))
            {
	    		Thread.sleep(2000);
            	driver.switchTo().window(wh).close();
            }
	    }
	    
        

	    
	    
	    
	    }
	}


