package Advanced_selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class working_with_adding_screenshot {
	static WebDriver driver;
	public static void main(String[] args) {
    LocalDateTime systemdate=LocalDateTime.now();
	String reprortname=systemdate.toString().replaceAll(":","-");
	ExtentReports report=new ExtentReports("./Reports/"+reprortname+"report.html",true);
	ExtentTest test=report.startTest("DEMOSTART");
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com");
	test.log(LogStatus.PASS,"WELCOME PAGE DISPLAYED");
	test.log(LogStatus.INFO,test.addScreenCapture(screecapture()));
	report.endTest(test);
	report.flush();
	}
	public static String screecapture(){
		LocalDateTime systemdate=LocalDateTime.now();
		String screenshotname=systemdate.toString().replaceAll(":","-");
		String imgpath="./Screenshots"+screenshotname+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(imgpath);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+imgpath;
		
		
	}
	
	
	
}
