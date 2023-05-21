package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPagaSource {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
        WebDriver driver= new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		String scode=driver.getPageSource();//for getting source code of current webpage
		
		System.out.println(scode);

		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			

		}

		
		
		
		
		
		
		
	}


