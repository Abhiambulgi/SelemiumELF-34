package Seleniumclassic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class working_with_sortby_dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/books");
	WebElement l= driver.findElement(By.id("products-viewmode"));
	Select sortby=new Select(l);
	List<WebElement> options=sortby.getOptions();
	for(WebElement wb:options){
	System.out.println(wb.getText());
	}
	driver.quit();
	
	
}
}
