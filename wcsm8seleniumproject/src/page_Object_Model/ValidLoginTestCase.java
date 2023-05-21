package page_Object_Model;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		
		Flib flib = new Flib();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
	    lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
	    Thread.sleep(2000);
	    
	  
	   
	    
	    
	}

}
