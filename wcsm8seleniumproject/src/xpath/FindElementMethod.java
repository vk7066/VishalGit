package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("http://desktop-jmehcjo/login.do");
		
		WebElement usernametextbox=driver.findElement(By.name("username"));
		usernametextbox.sendKeys("admin");
		System.out.println(usernametextbox);//we will get adress of webelement as a output
		
		
		
		
		
		
		
	}

}
