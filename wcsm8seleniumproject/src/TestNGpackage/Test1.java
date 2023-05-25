package TestNGpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import page_Object_Model.IAutoConstant;

public class Test1 implements IAutoConstant{
  @Test
  public void test1method() {
	  System.setProperty(CHROME_KEY, CHROME_PATH);
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 //too see time difference
	 long threadID = Thread.currentThread().getId();
	Reporter.log(threadID+"is the thread id",true);
	Reporter.log("test1Method");
	 
	driver.get("https://www.Google.com");
	 driver.switchTo().activeElement().sendKeys("what is sql",Keys.ENTER);
	 driver.quit();
  }
}
