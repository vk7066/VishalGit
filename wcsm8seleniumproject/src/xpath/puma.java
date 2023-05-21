package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class puma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/in/en/");
		Thread.sleep(3000);
	}

}
