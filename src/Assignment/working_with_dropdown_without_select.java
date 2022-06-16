package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Advanced_selenium.chromeTC;

public class working_with_dropdown_without_select {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.xpath("(//a[@href='/jewelry'])[1]")).click();
	for(int i=0;i<5;i++){
	driver.findElement(By.id("products-orderby")).click();
	/*JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(script, args)*/
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	/*act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();*/
	act.sendKeys(Keys.ENTER).perform();
}
}
}