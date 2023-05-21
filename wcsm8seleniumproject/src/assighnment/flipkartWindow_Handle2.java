package assighnment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartWindow_Handle2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Hp laptops");
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[.='HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop']")).click();
		
		Set<String> allHanldes = driver.getWindowHandles();
		System.out.println(parentHandle);
		System.out.println(allHanldes);
		
		for(String wh:allHanldes)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		
		String currentpagetitle = driver.getTitle();
		if(currentpagetitle.equals("HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop  (14 inch, Natural Silver, 1.41 kg, With MS Office)"))
		{
			System.out.println("its child window");
		}
		
	}

}
