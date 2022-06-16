package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_controlall_backspace {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	WebElement serach=driver.findElement(By.xpath("//input[@autocomplete='off']"));
	serach.sendKeys("14.1-inch Laptop");
	serach.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	serach.sendKeys(Keys.BACK_SPACE);
}
}
