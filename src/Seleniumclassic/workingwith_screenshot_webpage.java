package Seleniumclassic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingwith_screenshot_webpage {
	public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String Screenshot=systemdate.toString().replaceAll(":","-");
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	/*WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();*/
	//driver1.get("https://www.makemytrip.com/");
	//driver.get("https://www.easemytrip.com/");
	/*TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File d=new File("./Screenshots/"+Screenshot+".png");
	try {
		FileHandler.copy(temp,d);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	ChromeDriver driver1=new ChromeDriver();
	driver1.get("https://www.makemytrip.com/");
	driver1.getScreenshotAs(OutputType.FILE);
	File d1=new File("./Screenshots/"+Screenshot+".png");
}
}
