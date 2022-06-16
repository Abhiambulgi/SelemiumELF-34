package Seleniumclassic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement_loctor_mistake {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	List<WebElement> l=driver.findElements(By.xpath("//input[@class='text']"));
   for(WebElement s:l){
	  // s.click();
	   System.out.println(s);
   }
}
}
