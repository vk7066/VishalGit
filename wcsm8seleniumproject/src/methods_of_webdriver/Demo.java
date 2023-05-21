package methods_of_webdriver;

import java.awt.RenderingHints.Key;
import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.page.model.NavigatedWithinDocument;
import org.openqa.selenium.devtools.v85.runtime.Runtime.CallFunctionOnResponse;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	
		
 
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        driver.switchTo().activeElement().sendKeys("7066171419",Keys.ENTER);
        
        driver.navigate().back();
        
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        
        driver.navigate().back();
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();   
        driver.quit();
        
        
        
        
       
        
        
		
		
		
		
	}

}
