package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData_forLoop {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read
		Sheet sheet = wb.getSheet("IPL");//getting into the sheet
		
		for(int r=1;r<=sheet.getLastRowNum();r++)//read multiple data using for loop
		{
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(0);
			String tdata = cell.getStringCellValue();
			System.out.println(tdata);
			Thread.sleep(1000);
		}
		
		//Generalize the row count
		FileInputStream fis2 = new FileInputStream("./data/Testdata.xlsx");//Provide the path of file
		Workbook wb2 = WorkbookFactory.create(fis2);//make file ready for read
		Sheet sheet2 = wb.getSheet("IPL");//getting into the sheet
		int rowcount=sheet2.getLastRowNum();
		System.out.println(rowcount);
		
	

		
	}

}
