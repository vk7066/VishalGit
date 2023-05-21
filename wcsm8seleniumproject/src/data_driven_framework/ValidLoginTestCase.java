package data_driven_framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLoginTestCase extends Flib {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-jmehcjo/login.do");
		
		//To read data from external files create the obj of flip
		Flib flib = new Flib();
		String validUsername= flib.readExcelData("./data/ActiTimeTestData.xlsx", "VALIDCREDS", 1, 0);
		String validPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "VALIDCREDS", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
		 
		
		
	}

}
