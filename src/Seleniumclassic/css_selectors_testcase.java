package Seleniumclassic;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selectors_testcase {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	String sr="computer";
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys(sr);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	try{
	if(driver.findElement(By.cssSelector("img[alt='Picture of Build your own cheap computer']")).isDisplayed()){
		System.out.println("PASS-1");
	}
	}
	catch(Exception e){
		System.out.println("failll");
	}
	/*else{
		System.out.println("fail");
	}*/
	driver.quit();
}
}
