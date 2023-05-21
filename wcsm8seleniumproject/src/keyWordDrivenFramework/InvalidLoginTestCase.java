package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int RC = flib.rowCount(EXCEL_PATH, "INVALIDCREDS");
		for(int r=1;r<=RC;r++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", r, 0);
		String invalidpass = flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", r, 1);
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		driver.findElement(By.name("pwd")).sendKeys(invalidpass);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}

}
