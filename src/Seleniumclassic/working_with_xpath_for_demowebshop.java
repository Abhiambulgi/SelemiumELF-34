package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_xpath_for_demowebshop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@title='Close']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	String text=driver.findElement(By.xpath("(//table[1])/tbody/tr[1]/td[3]/a")).getText();
	if(text.contains("14.1-inch Laptop")){
		System.out.println("PASS");
		
	}
	driver.close();
	
	
}
}
