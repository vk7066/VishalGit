package qsp;

import java.util.Scanner;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp2 //Rtp=RunTime Polymorphism
{
 static WebDriver driver;
 public static void main(String[] args) throws InterruptedException
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("select the browser which u want to open!");
  String browserValue=sc.next();
  
  if(browserValue.equalsIgnoreCase("chrome"))
  {
   //To avoid illeagleStateException
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   
   //To avoid connectionFailedException
   ChromeOptions co=new ChromeOptions();
   co.addArguments("--remote-allow-origins=*");
   
   driver=new ChromeDriver(co);
   driver.manage().window().maximize();//To maximize the window
   
   driver.get("https://www.flipkart.com");
   
   Thread.sleep(3000);//to stop exicution of script for 3seconds
   driver.close();//to close the browser
  }
  else if(browserValue.equalsIgnoreCase("FireFox"))
  {
System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
	   
   driver=new FirefoxDriver();
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.close();
  }
  else
  {
   System.out.println("select valid browser value!!!");
   
  }
 }
}