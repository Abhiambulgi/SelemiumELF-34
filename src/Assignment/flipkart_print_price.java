package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_print_price {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	search.sendKeys("mobile");
	search.sendKeys(Keys.ENTER);
	WebElement cli=driver.findElement(By.xpath("//div[text()='Infinix HOT 12 Play (Daylight Green, 64 GB)']"));
	cli.click();
	WebElement price=driver.findElement(By.xpath("(//div[text()='₹8,499']/../..//div[text()='₹8,499'])[1]"));
	price.getText();
	if(price.isDisplayed())
	{
		System.out.println("First Price "+price.getText());
	}
	String amazon=driver.getWindowHandle();
	Set<String> wb=driver.getWindowHandles();
	for(String a1:wb){
		if(amazon.equals(a1)==false){
			driver.switchTo().window(a1);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']|//button[@class='_2KpZ6l _2U9uOA _3v1-ww']/../..//button[contains(text(),'ADD TO CART')]")).click();
	driver.findElement(By.xpath("//button[text()='+']")).click();
	WebElement price2=driver.findElement(By.xpath("//span[text()=' ₹18,056']"));
	price2.getText();
	if(price2.isDisplayed())
	{
		System.out.println("Second Price "+price2.getText());
	}
	
	
		}
	}
	
}
}

