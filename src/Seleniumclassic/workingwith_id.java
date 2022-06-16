package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class workingwith_id {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	Thread.sleep(1000);
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("ABHISHEK");
	driver.findElement(By.id("LastName")).sendKeys("Ambulgi");
	driver.findElement(By.id("Email")).sendKeys("abhiaa@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(3000);
	driver.close();
}
}
