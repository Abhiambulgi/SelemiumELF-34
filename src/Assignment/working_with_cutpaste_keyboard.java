package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_cutpaste_keyboard {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com.");
	WebElement UN=driver.findElement(By.cssSelector("[placeholder='Email address or phone number']"));
	UN.sendKeys("abhishek");
	Thread.sleep(1000);
	UN.sendKeys(Keys.CONTROL+"a");
	UN.sendKeys(Keys.CONTROL+"x");
	//UN.sendKeys(Keys.CONTROL+"c");
	WebElement PWD=driver.findElement(By.cssSelector("[placeholder='Password']"));
	PWD.sendKeys(Keys.CONTROL+"v");
}
}
