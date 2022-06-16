package Advanced_selenium;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class workking_with_extentreports {
	public static void main(String[] args) {
		LocalDateTime syastemdate=LocalDateTime.now();
	    String reportname=syastemdate.toString().replaceAll(":","-");
		ExtentReports report=new ExtentReports("./Reports/"+reportname+"report.html",false);
		ExtentTest test=report.startTest("Extent Start");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(LogStatus.FATAL,"Browseer not maximized");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.zomato.com");
		test.log(LogStatus.PASS,"browser launhed");
		WebElement find=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", find);
		test.log(LogStatus.PASS,"TESTCASE PASS");
		report.endTest(test);
		report.flush();
	}
}
