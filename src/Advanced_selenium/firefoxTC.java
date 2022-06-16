package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class firefoxTC {
		WebDriver driver;
	@BeforeClass
	public void openbrowser(){
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterClass
	public void close(){
		driver.close();
	}
	}

