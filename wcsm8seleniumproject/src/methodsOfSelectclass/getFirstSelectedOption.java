package methodsOfSelectclass;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Documents/dropdownmulselect.html");
	
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel=new Select(dropDown);
		
		for(int i=0;i<6;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		WebElement firstOption = sel.getFirstSelectedOption();
		String value = firstOption.getText();
		System.out.println(value);
		
	}

}
