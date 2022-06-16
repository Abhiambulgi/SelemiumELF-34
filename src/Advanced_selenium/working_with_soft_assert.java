package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class working_with_soft_assert extends BaseTest {
	@Test
	public void TC(){
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		WebElement registerlink=driver.findElement(By.className("ico-register"));
		SoftAssert ast=new SoftAssert();
		/*ast.assertEquals(registerlink.getText(),"Register","PASS");
		registerlink.click();*/
		/*ast.assertNotEquals(registerlink.getText(),"Register");
		registerlink.click();*/
		/*ast.assertTrue(false,"PASS");
		registerlink.click();*/
		ast.assertFalse(true);
		ast.assertAll();
		
}
}
