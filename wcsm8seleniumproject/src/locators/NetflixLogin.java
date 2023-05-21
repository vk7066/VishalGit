package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		/*driver.findElement(By.id("id_userLoginId")).sendKeys("vk66@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("vk@4543");*/
		
	}

}
