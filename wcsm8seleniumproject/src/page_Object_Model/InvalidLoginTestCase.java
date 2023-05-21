package page_Object_Model;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
	   BaseTest bt=new BaseTest();
	   Flib flib = new Flib();
	   bt.setUp();
	   LoginPage lp = new LoginPage(driver);
	   for(int r=1;r<=flib.rowCount(EXCEL_PATH,"INVALIDCREDS");r++)
	   {
	   lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", r, 0),flib.readExcelData(EXCEL_PATH, "INVALIDCREDS", r, 1));
	   }
	   Thread.sleep(2000);
	   bt.tearDown();
	   System.out.println("Test Complete...!");
	   
	   
	   
	   
	}

}
