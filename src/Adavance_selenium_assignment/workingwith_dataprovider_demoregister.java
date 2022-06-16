package Adavance_selenium_assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Advanced_selenium.working_with_multipleread;

public class workingwith_dataprovider_demoregister {
@Test(dataProvider="register")
public void register(String firstname,String lastname,String email,String pwd,String cnpwd) throws AWTException, InterruptedException{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.xpath("//input[@value='M']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cnpwd);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	WebElement reg=driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));

	if(reg.isDisplayed()){
		System.out.println("test cases pass");
	}else{
	   System.out.println("test case fail");
	}
}
@DataProvider(name="register",parallel=true)
public Object[][] regi() throws EncryptedDocumentException, IOException
{   
	return working_with_multipleread.data("Sheet1");
}
}

