package Adavance_selenium_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Advanced_selenium.working_with_multipleread;

public class TestCase {
@Test(dataProvider="test case")
public void Testcases(String fn,String num,String date,String execute){
	/*File file=new File("./Testdata/testcase.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("Sheet1");*/
	System.out.println(fn);
	System.out.println(num);
	System.out.println(date);
	System.out.println(execute);
}
@DataProvider(name="test case")
public Object[][] data() throws EncryptedDocumentException, IOException{
	Object [][] data=new Object[1][4];//first store row value
	/*data[0][0]="Rohit";
	data[0][1]="Sharma";
	data[0][2]="Rohit@264";
	data[0][3]=45264;*/
	return working_with_multipleread.data("");
	
}
}
