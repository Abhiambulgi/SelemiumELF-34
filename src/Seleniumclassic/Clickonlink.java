package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonlink {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ambul/Downloads/HTMLDemoPage.html");
	WebElement link=driver.findElement(By.tagName("a"));
	link.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.close();
}
}
