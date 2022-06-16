package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_css_selector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ambul/Downloads/LocatorsPractice.html");
	String un="Abhishek";
	String pwd="12346";
	driver.findElement(By.cssSelector("input[class='username']")).sendKeys(un);
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys(pwd);
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.cssSelector("input[name='a']")).click();
	driver.findElement(By.cssSelector("input[value='cancel']")).click();
	Thread.sleep(1000);
	driver.close();
}
}
