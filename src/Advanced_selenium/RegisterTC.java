package Advanced_selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegisterTC extends chromeTC{

	@Test(dataProvider="data")
	public void TC_02(String fn,String ln,String email,String pass,String conpass){
		driver.get("http://demowebshop.tricentis.com");
		   Welcomepage welcome1=new Welcomepage(driver);
		   welcome1.reg();
		   Register_page register=new Register_page(driver);
		   register.gender();
		   register.firstname(fn);
		   register.lastname(ln);
		   register.email(email);
		   register.password(pass);
		   register.conpass(conpass);
		   register.registerbutton();
		   
	}
	@DataProvider(name="data") 
	  public  Object[][] datap() throws EncryptedDocumentException, IOException{
	 return working_with_multipleread.data("Sheet2");
	   }
	

}
