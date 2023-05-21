package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/Testdata.xlsx");//provide the path of excel file
		Workbook wb=WorkbookFactory.create(fis);//make the file ready read
	    org.apache.poi.ss.usermodel.Sheet sheet=  wb.getSheet("IPL");//get into sheet
	   
	   
	    Scanner sc=new Scanner(System.in);
	   for(int i=1;i<=10;i++)
	   {
		  
		   Row row = sheet.getRow(i);
		  Cell cell = row.createCell(4);//is use to create the cell
		   String input = sc.next();
		   cell.setCellValue(input);//set the value in that cell
	   }
	   System.out.println("Excel data inserted..!");
	   FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
	   wb.write(fos);
	   
	}

}
