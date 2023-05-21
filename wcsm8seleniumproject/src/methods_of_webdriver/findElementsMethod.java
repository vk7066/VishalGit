package methods_of_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("i phone");
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		List<WebElement> pohaoptions= (List<WebElement>) driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		for(int i =1;i<=pohaoptions.size();i++)
		{
			String poha=pohaoptions.get(i).getText();
					
			System.out.println(poha);
			Thread.sleep(2000);
		}
		
		/*for(WebElement poha:pohaoptions)
		{
			System.out.println(poha.getText());
			Thread.sleep(2000);
		}*/
	}

}
