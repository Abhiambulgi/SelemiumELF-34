package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_javascriptexecuter_scrolltoview {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	WebElement find=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView(false);", find);
	js.executeScript("arguments[0].scrollIntoView(true);", find);
}
}
