package Advanced_selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTC extends chromeTC{
	@Test(dataProvider="data")
	public void TC_01(String email,String password) throws IOException{
		driver.get("http://demowebshop.tricentis.com");
	  Welcomepage welcome=new Welcomepage(driver);
	   welcome.getLoginlink().click(); 
	   
	   LOGIN_PAGE login=new LOGIN_PAGE(driver);
	   login.email(email);
	   login.password(password);
	   login.logout();
	   HOME_PAGE home=new HOME_PAGE(driver);
	   if(home.getLogoutlink().isDisplayed()){
		   Reporter.log("PASS:USER IS LOGGEDIN",true);
	   }
	}
	   
	 @DataProvider(name="data",parallel=true) 
	  public  Object[][] datap() throws EncryptedDocumentException, IOException{
	 return working_with_multipleread.data("Sheet1");
	   }
	   
	}


