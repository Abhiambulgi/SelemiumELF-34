package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class working_with_datadriven {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("./Testdata/TestData.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Sheet1");//import org.apache.poi.ss.usermodel.Sheet;
	System.out.println(sheet.getRow(0).getCell(1));
	System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());
	System.out.println(sheet.getRow(1).getCell(2).toString());
	System.out.println(sheet.getRow(2).getCell(1).getDateCellValue());
	System.out.println(sheet.getRow(4).getCell(3).getBooleanCellValue());
	System.out.println(sheet.getRow(5).getCell(3).getBooleanCellValue());
	
	
	
}
}
