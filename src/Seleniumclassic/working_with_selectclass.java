package Seleniumclassic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class working_with_selectclass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.xpath("(//a[contains(text(),'Books') ] )[1]")).click();
	Thread.sleep(2000);
	WebElement doprdown=driver.findElement(By.id("products-orderby"));
	Select sortbydropdown=new Select(doprdown);
	List<WebElement> option=sortbydropdown.getOptions();
	for(int i=0; i<option.size();i++){
		Select sortbydropdown1=new Select(driver.findElement(By.id("products-orderby")));
	sortbydropdown1.selectByIndex(i);
	}
/*	sortbydropdown.selectByVisibleText("Position");
	sortbydropdown.selectByVisibleText("Name: A to Z");
	sortbydropdown.selectByVisibleText("Name: Z to A");
	sortbydropdown.selectByVisibleText("Price: Low to High");
	sortbydropdown.selectByVisibleText("Price: High to Low");
	sortbydropdown.selectByVisibleText("Created on");*/
	

	
}
}
