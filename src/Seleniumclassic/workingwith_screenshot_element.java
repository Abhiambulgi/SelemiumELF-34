package Seleniumclassic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingwith_screenshot_element {
public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String Screenshot=systemdate.toString().replaceAll(":","-");
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	WebElement popup=driver.findElement(By.xpath("//div[contains(text(),'Hey! Got any questions?')]"));
	if(popup.isDisplayed()){
		File temp=popup.getScreenshotAs(OutputType.FILE);
		File d=new File("./Screenshots/"+Screenshot+"temp.png");
	    try {
			FileHandler.copy(temp,d);//import selenium file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
}
