package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
        WebDriver driver= new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		String loginPageTitle=driver.getTitle();//for gettting title of current wev page
		
		System.out.println(loginPageTitle);
//      System.out.println(driver.getTitle());//call directly in printting statment
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
