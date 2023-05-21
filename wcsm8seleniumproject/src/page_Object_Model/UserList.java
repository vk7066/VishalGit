package page_Object_Model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserList {
	
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']") private WebElement userLogo;
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createnewUserBtn;
	@FindBy(xpath="//*[@name='username']") private WebElement usernameTF;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement passwordTF;
	@FindBy(xpath="//*[@name='passwordTextRetype']")private WebElement retypepasswordTF;
	@FindBy(xpath="//*[@name='firstName']")private WebElement firstnameTF;
	@FindBy(xpath="//*[@name='lastName']")private WebElement lastnameTF;
	@FindBy(xpath="//input[@type='submit']")private WebElement createuserBtn;
	@FindBy(xpath="//*[contains(@class,'item active')]")private WebElement userlist;
	@FindBy(xpath="//a[.='kumbhar, vishal (vishal19)']")private WebElement usercreated;
	@FindBy(xpath="//input[@value='Delete This User']")private WebElement deleteuser;
	
	
	public UserList(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getUserLogo() {
		return userLogo;
	}
	public WebElement getCreatenewUserBtn() {
		return createnewUserBtn;
	}
	public WebElement getUsernameTF() {
		return usernameTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getRetypepasswordTF() {
		return retypepasswordTF;
	}
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public WebElement getCreateuserBtn() {
		return createuserBtn;
	}
	
	
	public void createUser(String username, String password, String firstname,String lastname) throws InterruptedException
	{
		Thread.sleep(2000);
		userLogo.click();
		createnewUserBtn.click();
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		retypepasswordTF.sendKeys(password);
		firstnameTF.sendKeys(firstname);
		lastnameTF.sendKeys(lastname);
	    BaseTest bt=new BaseTest();
	    bt.scroll();
	    Thread.sleep(2000);
		createuserBtn.click();
		
		
	}
	public void deleteUser() throws InterruptedException
	{
		userlist.click();
		usercreated.click();
		Thread.sleep(2000);
		deleteuser.click();
		BaseTest bt=new BaseTest();
		Thread.sleep(2000);
		bt.acceptalert();
		
	}
	
	
	

}
