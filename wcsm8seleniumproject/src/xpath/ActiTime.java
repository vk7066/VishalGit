package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("http://desktop-jmehcjo/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']")).click();
	    driver.findElement(By.xpath("//a[text()='Create new tasks']")).click();
	    
	   driver.quit();
	    
	    
	}

}
