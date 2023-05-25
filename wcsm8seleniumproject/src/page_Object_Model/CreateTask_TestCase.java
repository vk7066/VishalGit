package page_Object_Model;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;

public class CreateTask_TestCase extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		TaskList tl = new TaskList(driver);
		tl.createTask();
		Thread.sleep(2000);
		tl.deletTask();
		bt.tearDown();        
	
	}
	 
}
