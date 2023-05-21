package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//To open the browser create the object of base test
		BaseTest bt=new BaseTest();
		bt.openBrowser();
	    Flib flib = new Flib();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}
