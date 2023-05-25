package TestNGpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import page_Object_Model.IAutoConstant;

public class Test2 implements IAutoConstant{
  @Test
  public void test2method() {
	  System.setProperty(GECKO_KEY, GECKO_PATH);
	 WebDriver driver= new FirefoxDriver();
	 driver.manage().window().maximize();
	 long threadID = Thread.currentThread().getId();
		Reporter.log(threadID+"is the thread id",true);
		Reporter.log("test2Method");
	 driver.get("https://www.Google.com");
	 driver.switchTo().activeElement().sendKeys("what is java",Keys.ENTER);
	 driver.quit();
  }
}
