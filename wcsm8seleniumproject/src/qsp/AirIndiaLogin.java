package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=MjJmRk9-fjNCc0R4Sm1fRUdNcVJwdjFtfi5EcDVzMngzdlJjdUNVcVVnVzQt_en-GB_false_&nonce=MjJmRk9-fjNCc0R4Sm1fRUdNcVJwdjFtfi5EcDVzMngzdlJjdUNVcVVnVzQt&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=s1X_k68g25ZhPQZjFnJZJgEBWsHKcqUeAhn7CtE2bPI&ui_locales=en-GB");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("vkbrand55@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vk567667");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}
}
