package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_the_id {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	String demotitle=driver.getTitle();
	if(demotitle.contains("Demo")){
		System.out.println("PASS1");
	}
	driver.findElement(By.className("ico-register")).click();
	String registertitle=driver.getTitle();
	if(registertitle.contains("Register")){
		System.out.println("PASS2");
	}
	String un="ABHISHEK";
	String ln="Ambulgi";
	String email="abhia221a@gmail.com";
	String pwd="123456";
	String cpwd="123456";
	
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(un);
	driver.findElement(By.id("LastName")).sendKeys(ln);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
	driver.findElement(By.id("register-button")).click();
	if(driver.findElement(By.className("ico-logout")).isDisplayed()){
		System.out.println("PASS3");
		driver.close();
	}
	
}
}
