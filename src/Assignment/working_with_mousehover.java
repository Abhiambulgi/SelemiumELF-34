package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_mousehover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).build().perform();
	Thread.sleep(2000);
	act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-productid='72']")).click();
	driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	if(driver.findElement(By.xpath("(//input[@type='submit'])[2]")).isDisplayed()){
		System.out.println("Product is Displayed");
	}
	driver.quit();
}
}
