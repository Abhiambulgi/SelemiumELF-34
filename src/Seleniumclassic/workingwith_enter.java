package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwith_enter {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	WebElement serach=driver.findElement(By.xpath("//input[@autocomplete='off']"));
	serach.sendKeys("14.1-inch Laptop");
	Actions act=new Actions(driver);
	act.sendKeys(serach, Keys.ENTER).perform();
}
}
