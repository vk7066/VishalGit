package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.browser.model.Bucket;
import org.openqa.selenium.interactions.Actions;

public class doubleCickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-jmehcjo/login.do");
		//handle login page with valid inputs
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Home page
		//click on settings
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		//click on logo and color
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logo & Color Scheme')]")).click();
		//to click on radio btn
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		//to click on choose file btn
		Thread.sleep(2000);
		//to double click on choose file btn
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		
	}

}
