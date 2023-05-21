package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Read_ExcelData {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./data/Testdata.xlsx");//provide the path of excel file
		Workbook wb=WorkbookFactory.create(fis);//make the file ready read
	   org.apache.poi.ss.usermodel.Sheet sheet=  wb.getSheet("IPL");//get into sheet
	   
        Row row=sheet.getRow(4);//get into desighred row
        org.apache.poi.ss.usermodel.Cell cell=row.getCell(1);//get into desighred cell/column
        String data = cell.getStringCellValue();//read the value from cell
	    System.out.println(data);
	   
	   
	 
	      }

}
