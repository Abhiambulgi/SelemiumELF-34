package Adavance_selenium_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	public class Workingwithmultiplemethods {
	
			public static String readString(String sheet,int r,int c) throws EncryptedDocumentException, IOException{
				File file=new File("./Testdata/TestData.xlsx");
				FileInputStream fis=new FileInputStream(file);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sheet1=wb.getSheet(sheet);
				return sheet1.getRow(r).getCell(c).toString();
			}
			public static String readnumericvalue(int r,String sheet,int c) throws EncryptedDocumentException, IOException{
				File file=new File("./Testdata/TestData.xlsx");
				FileInputStream fis=new FileInputStream(file);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sheet1=wb.getSheet(sheet);
				return sheet1.getRow(r).getCell(c).toString();
			}
			
			public static String readDate(int r,int c,String sheet) throws EncryptedDocumentException, IOException{
				File file=new File("./Testdata/TestData.xlsx");
				FileInputStream fis=new FileInputStream(file);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sheet1=wb.getSheet(sheet);
				return sheet1.getRow(r).getCell(c).toString();
			}
			
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			System.out.println(Workingwithmultiplemethods.readString("Sheet1", 1, 0));
			System.out.println(Workingwithmultiplemethods.readnumericvalue(3, "Sheet1", 2));
			System.out.println(Workingwithmultiplemethods.readDate(2, 3, "Sheet1"));
			
		}  
		}
	