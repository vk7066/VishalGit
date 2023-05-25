package page_Object_Model;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class createUserTestCase extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
BaseTest bt=new BaseTest();
		
		Flib flib = new Flib();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
	    lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
	    Thread.sleep(2000);
	    
	   
	    
	   UserList ul = new UserList(driver);
	   String usernameTF = flib.readExcelData(EXCEL_PATH, "createUser", 1, 0);
	   String passwordTF = flib.readExcelData(EXCEL_PATH, "createUser", 1, 1);
	   String retypepassword = flib.readExcelData(EXCEL_PATH, "createUser", 1, 2);
	   String firstnameTF = flib.readExcelData(EXCEL_PATH, "createUser", 1, 3);
	   String lastname = flib.readExcelData(EXCEL_PATH, "createUser", 1, 4);
	   
	   ul.createUser(usernameTF, passwordTF, firstnameTF, lastname);
	   ul.deleteUser();
	   
	   bt.tearDown();
	   
	}

}
