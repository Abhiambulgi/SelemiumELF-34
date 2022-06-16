package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	String em="aca@gmail.com";
	String pwd="123456";
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(em);
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	try{
	if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
		System.out.println("pass");
	}
	}
	catch(Exception e){
		System.out.println("Fail");
	}
	Thread.sleep(1000);
	driver.quit();
}
}
