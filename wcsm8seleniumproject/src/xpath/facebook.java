package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("vishal");
		driver.findElement(By.name("lastname")).sendKeys("kumbhar");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("7066171419");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vk2222");
		Thread.sleep(2000);
		driver.findElement(By.id("u_3_5_DC")).click();
		driver.findElement(By.id("u_3_s_5K")).click();
		
	}

}
