package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_method {
public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     ChromeOptions co =new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     
      WebDriver driver=new ChromeDriver(co);
      driver.manage().window().maximize();
      
      
      driver.get("https://www.flipkart.com");
      Thread.sleep(2000);
      driver.close();
      
      
	
  }
}
