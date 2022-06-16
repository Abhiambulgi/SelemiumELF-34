package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class working_with_hard_assert extends BaseTest {
@Test
public void TC(){
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	WebElement registerlink=driver.findElement(By.className("ico-register"));
	/*Assert.assertEquals(registerlink.getText(),"Register","PASS");
	registerlink.click();*/
	/*Assert.assertNotEquals(registerlink.getText(),"Register");
	registerlink.click();*/
	/*Assert.assertTrue(false,"PASS");
	registerlink.click();*/
	Assert.assertFalse(true);
	registerlink.click();
	
	
}
}
