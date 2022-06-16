package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class entervalusebytagname {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ambul/Downloads/SampleHTMLPage.html");
	Thread.sleep(2000);
	WebElement input=driver.findElement(By.tagName("input"));
	input.sendKeys("Abhishek");
	Thread.sleep(1000);
	driver.close();
	
}
}
