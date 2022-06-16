package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest{
	public class chromeTC {
		WebDriver driver;
		@Parameters ("browser")
	@BeforeClass
	public void openbrowser(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver=new ChromeDriver();
			}
		}

	@AfterClass
	public void closebrowser(){
		driver.close();
	}
	}
} 

