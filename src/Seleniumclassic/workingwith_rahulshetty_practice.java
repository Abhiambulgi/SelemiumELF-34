package Seleniumclassic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_rahulshetty_practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	Thread.sleep(2000);
	String Reg=driver.getWindowHandle();
	Set<String> log=driver.getWindowHandles();
	for(String wb:log){
		if(Reg.equals(wb)==false)
	driver.switchTo().window(wb);
	}
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[contains(@style,'position: absolute; inset: 0px; box-shadow')]")).click();
	driver.findElement(By.xpath("//span[text()='Register']")).click();
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Abhishek");
	driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("ambulgiabhishek@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhi@7022");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	for(String wb:log){
		if(Reg.equals(wb)==false){
	driver.switchTo().window(wb);
		driver.close();
	}
     driver.switchTo().window(Reg);
	driver.findElement(By.xpath("//a[@id='opentab']")).click();
}
}
}

