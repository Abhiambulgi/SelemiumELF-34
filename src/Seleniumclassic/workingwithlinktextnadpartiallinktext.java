package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithlinktextnadpartiallinktext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	Thread.sleep(1000);
	driver.findElement(By.linkText("BOOKS")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Shopping")).click();
	Thread.sleep(1000);
	driver.close();
}
}
