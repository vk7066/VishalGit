package data_driven_framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestData extends Flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-jmehcjo/login.do");
		
		//To read data from external files create the obj of flip
		Flib flib = new Flib();
		int rc=flib.rowCount("./data/ActiTimeInvalidTdata.xlsx","INVALIDCREDS");
		for(int r=1;r<=rc;r++)
		{
			String invalidUsername= flib.readExcelData("./data/ActiTimeInvalidTdata.xlsx", "INVALIDCREDS", r, 0);
			String invalidPassword = flib.readExcelData("./data/ActiTimeInvalidTdata.xlsx", "INVALIDCREDS", r, 1);
		
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
			
			System.out.println(invalidUsername);
			System.out.println(invalidPassword);
			
		}
		   Thread.sleep(2000);
		   System.out.println(rc);
		   driver.quit();
		   
		   
		   
		   
		   
		   
		
	}

}
