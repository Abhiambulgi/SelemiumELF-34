package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_amazon_xpath_with_text {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[text()='Samsung Galaxy M33 5G (Deep Ocean Blue, 6GB, 128GB Storage) | Travel Adapter to be Purchased Separately']/../../../../..//span[text()='₹17,999']")).click();
	
}
}
