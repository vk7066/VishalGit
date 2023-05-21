package page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(" http://desktop-jmehcjo/login.do");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
//		WebElement loginbtn = driver.findElement(By.id("loginButton"));
//		loginbtn.click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		username.clear();
		
	}

}
