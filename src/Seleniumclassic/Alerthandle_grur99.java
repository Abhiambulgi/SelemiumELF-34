package Seleniumclassic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle_grur99 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abhishek");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert ale=driver.switchTo().alert();
	ale.accept();
	Thread.sleep(2000);
	ale.accept();
}
}
