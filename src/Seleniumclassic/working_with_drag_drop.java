package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_drag_drop {
public static void main(String[] args) {
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
	act.dragAndDrop(source, target).perform();
	act.dragAndDrop(source1, target1).perform();
	act.dragAndDrop(source2, target2).perform();
	act.dragAndDrop(source3, target3).perform();
	act.dragAndDrop(source4, target4).perform();
	act.dragAndDrop(source5, target5).perform();
	act.dragAndDrop(source6, target6).perform();
}
}
