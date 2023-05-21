package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class actiTime2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/ActiTime.xlsx");//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read
		Sheet sheet = wb.getSheet("VALIDCRED");//getting into the sheet
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
	     driver.findElement(By.name("username"));
		 driver.findElement(By.name("pwd"));
	     driver.findElement(By.id("loginButton"));
		
		
	}

}
