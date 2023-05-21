package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {
   public static void main(String[] args) {
      // Set the path of the Chrome driver executable
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");

      // Create a new instance of ChromeDriver
      WebDriver driver = new ChromeDriver(co);

      // Navigate to Flipkart login page
      driver.get("https://shoppersstack.com/user-signin");

      // Maximize the browser window
      driver.manage().window().maximize();

      // Enter the email/phone number in the username field
      driver.findElement(By.xpath("class=\'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense\'z"))
      .sendKeys("vishal@250");

      // Enter the password in the password field
      driver.findElement(By.xpath("//input[@class=\'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense\']"))
            .sendKeys("vishal@250");

      // Click on the login button
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"))
            .click();

      // Wait for the login to complete and the home page to load
     // WebDriverWait wait = new WebDriverWait(driver, 10);
    //  wait.until(ExpectedConditions.urlContains("https://www.flipkart.com/"));

      // Print the title of the home page
      System.out.println("Title of the Home Page is : " + driver.getTitle());

      // Close the browser window
      driver.close();
   }
}
