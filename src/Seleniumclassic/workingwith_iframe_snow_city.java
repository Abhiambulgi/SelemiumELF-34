package Seleniumclassic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_iframe_snow_city {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://snowcityblr.com/contact-us/");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[contains(text(),'Directions')]")).click();
	
	
	
}
}
