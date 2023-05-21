package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetPositionOfBrowser {
	
	// by using manage method...
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Dimension targetSize = new Dimension(350,450);// object for dimention class and pass the values

		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);// pass the reference into setSize Method
		
		Point targetPosition = new Point(450,350);//object for Point class pass the values 
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPosition);//pass the reference  into setPositon method
		
		driver.close();
	}

}