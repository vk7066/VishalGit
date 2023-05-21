package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Record all the webElements of Login Page By using
	//@FindBy Annotation
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//input[@name='remember']") private WebElement cheakbox;
	@FindBy(linkText="Actimind Inc.") private WebElement actiMindLink;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheakbox() {
		return cheakbox;
	}
	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	//operational methods
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{   
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
	}
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
		
	}
 
}
