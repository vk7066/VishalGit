package methodsOfSelectclass;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import graphql.org.antlr.v4.runtime.tree.Tree;

public class EliminateDuplicates {
	
	//by using Treeset from Dropdown
	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Documents/drop.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		//To handle dropdown create obj of select class
		
		Select sel=new Select(dropDown);
		
		//To get all options From Dropdown
		List<WebElement> allOptions = sel.getOptions();
		
		//to eleminate duplicate & maintain insertion order we use 
		TreeSet<String> ts=new TreeSet<String>();
		
		for(int i=0;i<allOptions.size();i++)
		{
			//get the options &text of options
			String op=allOptions.get(i).getText();
			//add the text of options to tree set
			ts.add(op);
		}
		
		//to read the options from set
		for(String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
			
		}
		
		
	}

}
