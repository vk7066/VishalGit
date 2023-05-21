package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeOfBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
        WebDriver driver= new ChromeDriver(co);
       
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		Dimension targetSize = new Dimension(350, 450);//to set custom size
		
		driver.manage().window().setSize(targetSize);
		
	
		
		
		
	}                                                                                                                                     

}
