package Seleniumclassic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openthebrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	//driver.navigate().to("http://demowebshop.tricentis.com");
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
}
}
