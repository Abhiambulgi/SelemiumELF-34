package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithsamplepage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/ambul/Downloads/LocatorsPractice.html");
	Thread.sleep(1000);
	WebElement un=driver.findElement(By.className("username"));
	un.sendKeys("ABHISHEK");
	Thread.sleep(1000);
	WebElement pwd=driver.findElement(By.className("password"));
	pwd.sendKeys("123456");
	Thread.sleep(1000);
	WebElement checkbox=driver.findElement(By.className("checkbox"));
	checkbox.click();
	Thread.sleep(1000);
	WebElement radio=driver.findElement(By.name("a"));
	radio.click();
	Thread.sleep(1000);
	WebElement button=driver.findElement(By.className("button"));
	button.click();
	Thread.sleep(3000);
	driver.close();
	
	
}
}
