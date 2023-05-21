package locators;//Acti Time 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("http://desktop-jmehcjo/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
