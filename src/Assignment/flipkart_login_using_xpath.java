package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_login_using_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ambulgiabhi@gmail.com");
	driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("123456abhi");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
}
}
