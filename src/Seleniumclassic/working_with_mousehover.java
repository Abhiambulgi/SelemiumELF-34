package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_mousehover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
	//Thread.sleep(2000);
	act.click(driver.findElement(By.xpath("(//a[@style='color:;'])[1]"))).perform();
	/*//act.moveToElement(driver.findElement(By.xpath("//a[@data-group='women']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//a[@data-group='home-&-living']"))).build().perform();*/
	driver.close();
}
}
