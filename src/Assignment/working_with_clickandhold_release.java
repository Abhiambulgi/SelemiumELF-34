package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_clickandhold_release {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement source=driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
	WebElement target=driver.findElement(By.xpath("(//div[contains(text(),'Italy')])"));
	WebElement source1=driver.findElement(By.xpath("(//div[contains(text(),'Madrid')])[2]"));
	WebElement target1=driver.findElement(By.xpath("//div[contains(text(),'Spain')]"));
	WebElement source2=driver.findElement(By.xpath("(//div[contains(text(),'Seoul')])[2]"));
	WebElement target2=driver.findElement(By.xpath("//div[contains(text(),'South Korea')]"));
	WebElement source3=driver.findElement(By.xpath("(//div[contains(text(),'Copenhagen')])[2]"));
	WebElement target3=driver.findElement(By.xpath("//div[contains(text(),'Denmark')]"));
	WebElement source4=driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]"));
	WebElement target4=driver.findElement(By.xpath("//div[contains(text(),'United States')]"));
	WebElement source5=driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
	WebElement target5=driver.findElement(By.xpath("//div[contains(text(),'Norway')]"));
	WebElement source6=driver.findElement(By.xpath("(//div[contains(text(),'Stockholm')])[2]"));
	WebElement target6=driver.findElement(By.xpath("//div[contains(text(),'Sweden')]"));
	Actions act=new Actions(driver);
	act.clickAndHold(source).release(target).perform();
	act.clickAndHold(source1).release(target1).perform();
	act.clickAndHold(source2).release(target2).perform();
	act.clickAndHold(source3).release(target3).perform();
	act.clickAndHold(source4).release(target4).perform();
	act.clickAndHold(source5).release(target5).perform();
	act.clickAndHold(source6).release(target6).perform();
	Thread.sleep(2000);
	driver.quit();
	
}
}
